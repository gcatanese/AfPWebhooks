package com.adyen.examples.controller;

import com.adyen.examples.ApplicationProperty;
import com.adyen.examples.model.AccountHolderNotificationRequest;
import com.adyen.examples.util.EventHandler;
import com.adyen.examples.util.HMACValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * REST controller for receiving Adyen webhook notifications
 */

@RestController
@RequestMapping("/api")
public class WebhookController {
    private final Logger logger = LoggerFactory.getLogger(WebhookController.class);

    @Autowired
    private ApplicationProperty applicationProperty;
    @Autowired
    private HMACValidator hmacValidator;
    @Autowired
    private EventHandler eventHandler;

    @Autowired
    public WebhookController(ApplicationProperty applicationProperty) {
        this.applicationProperty = applicationProperty;

        if (this.applicationProperty.getHmacKey() == null) {
            logger.warn("ADYEN_HMAC_KEY is UNDEFINED (Webhook cannot be authenticated)");
        }
    }

    /**
     * Process incoming
     *
     * @param json Payload of the webhook
     * @return
     */
    @PostMapping("/webhooks/notifications")
    public ResponseEntity<String> webhooks(@RequestHeader Map<String, String> headers, @RequestBody String json) throws Exception {
        logger.info("/webhooks/notifications");

        String hmacsignature = headers.get("hmacsignature");

        if (hmacsignature.isBlank()) {
            logger.warn("HMAC Signature not found");
            throw new RuntimeException("HMAC Signature not found");
        }

        if (!hmacValidator.validateHMAC(json, hmacsignature, applicationProperty.getHmacKey())) {
            logger.warn("Invalid HMAC signature");
            throw new RuntimeException("Invalid HMAC signature");
        }

        // process AccountHolder webhook
        AccountHolderNotificationRequest accountHolderNotificationRequest = eventHandler.getAccountHolderNotificationRequest(json);
        logger.info("environment--->{}", accountHolderNotificationRequest.getEnvironment());

        // Acknowledge event has been consumed
        return ResponseEntity.ok().body("[accepted]");
    }

}

package com.adyen.examples.controller;

import com.adyen.examples.ApplicationProperty;
import com.adyen.examples.exception.InvalidWebhookTypeException;
import com.adyen.examples.service.*;
import com.adyen.examples.util.EventHandler;
import com.adyen.examples.util.HMACValidator;
import com.adyen.model.configurationwebhooks.AccountHolderNotificationRequest;
import com.adyen.model.configurationwebhooks.BalanceAccountNotificationRequest;
import com.adyen.model.configurationwebhooks.PaymentNotificationRequest;
import com.adyen.model.configurationwebhooks.SweepConfigurationNotificationRequest;
import com.adyen.model.reportwebhooks.ReportNotificationRequest;
import com.adyen.model.transferwebhooks.TransferNotificationRequest;
import com.adyen.notification.BankingWebhookHandler;
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
@CrossOrigin
@RequestMapping("/api")
public class WebhookController {
    private final Logger logger = LoggerFactory.getLogger(WebhookController.class);

    @Autowired
    private ApplicationProperty applicationProperty;
    @Autowired
    private HMACValidator hmacValidator;
    @Autowired
    private EventHandler eventHandler;

    @Autowired private AccountHolderService accountHolderService;
    @Autowired private BalanceAccountService balanceAccountService;
    @Autowired private PaymentInstrumentService paymentInstrumentService;
    @Autowired private SweepConfigurationService sweepConfigurationService;
    @Autowired private TransferService transferService;
    @Autowired private ReportService reportService;

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

        EventHandler eventHandler = new EventHandler();
        BankingWebhookHandler webhookHandler = new BankingWebhookHandler(json);


        String hmacsignature = headers.get("hmacsignature");

        if (hmacsignature == null || hmacsignature.isBlank()) {
            logger.warn("HMAC Signature not found");
            throw new RuntimeException("HMAC Signature not found");
        }

        if (!hmacValidator.validateHMAC(json, hmacsignature, applicationProperty.getHmacKey())) {
            logger.warn("Invalid HMAC signature");
            throw new RuntimeException("Invalid HMAC signature");
        }

        String type = eventHandler.getEventType(json);
        String environment = eventHandler.getEventEnvironment(json);

        logger.info("Event " + type + " on " + environment);

        switch (type) {
            case "balancePlatform.accountHolder.created":
                webhookHandler.getAccountHolderNotificationRequest().ifPresent((AccountHolderNotificationRequest event) -> {
                    accountHolderService.createAccoundHolder(event.getData());
                });
                break;
            case "balancePlatform.accountHolder.updated":
                webhookHandler.getAccountHolderNotificationRequest().ifPresent((AccountHolderNotificationRequest event) -> {
                    accountHolderService.updateAccoundHolder(event.getData());
                });
                break;
            case "balancePlatform.balanceAccount.created":
                webhookHandler.getBalanceAccountNotificationRequest().ifPresent((BalanceAccountNotificationRequest event) -> {
                    balanceAccountService.createBalanceAccount(event.getData());
                });
                break;
            case "balancePlatform.balanceAccount.updated":
                webhookHandler.getBalanceAccountNotificationRequest().ifPresent((BalanceAccountNotificationRequest event) -> {
                    balanceAccountService.updateBalanceAccount(event.getData());
                });
                break;
            case "balancePlatform.paymentInstrument.created":
                webhookHandler.getPaymentNotificationRequest().ifPresent((PaymentNotificationRequest event) -> {
                    paymentInstrumentService.createPaymentInstrument(event.getData());
                });
                break;
            case "balancePlatform.paymentInstrument.updated":
                webhookHandler.getPaymentNotificationRequest().ifPresent((PaymentNotificationRequest event) -> {
                    paymentInstrumentService.updatePaymentInstrument(event.getData());
                });
                break;
            case "balancePlatform.balanceAccountSweep.created":
                webhookHandler.getSweepConfigurationNotificationRequest().ifPresent((SweepConfigurationNotificationRequest event) -> {
                    sweepConfigurationService.createSweepConfiguration(event.getData());
                });
                break;
            case "balancePlatform.balanceAccountSweep.updated":
                webhookHandler.getSweepConfigurationNotificationRequest().ifPresent((SweepConfigurationNotificationRequest event) -> {
                    sweepConfigurationService.updateSweepConfiguration(event.getData());
                });
                break;
            case "balancePlatform.balanceAccountSweep.deleted":
                webhookHandler.getSweepConfigurationNotificationRequest().ifPresent((SweepConfigurationNotificationRequest event) -> {
                    sweepConfigurationService.deleteSweepConfiguration(event.getData());
                });
                break;
            case "balancePlatform.transfer.created":
                webhookHandler.getTransferNotificationRequest().ifPresent((TransferNotificationRequest event) -> {
                    transferService.createTransfer(event.getData());
                });
                break;
            case "balancePlatform.transfer.updated":
                webhookHandler.getTransferNotificationRequest().ifPresent((TransferNotificationRequest event) -> {
                    transferService.updateTransfer(event.getData());
                });
                break;
            case "balancePlatform.report.created":
                webhookHandler.getReportNotificationRequest().ifPresent((ReportNotificationRequest event) -> {
                    reportService.getGeneratedReport(event.getData());
                });
                break;
            default:
                // deal with unexpected event (ie there is a new event that must be processed?)
                logger.error("Unexpected event type: " + type);
                throw new InvalidWebhookTypeException("Unexpected event type: " + type);
        }

        // Acknowledge event has been consumed
        return ResponseEntity.ok().body("[accepted]");
    }

    public ApplicationProperty getApplicationProperty() {
        return applicationProperty;
    }

    public void setApplicationProperty(ApplicationProperty applicationProperty) {
        this.applicationProperty = applicationProperty;
    }
}

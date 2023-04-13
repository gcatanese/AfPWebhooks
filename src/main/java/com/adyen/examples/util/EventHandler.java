package com.adyen.examples.util;

import com.adyen.examples.exception.InvalidWebhookTypeException;
import com.adyen.examples.model.AccountHolderNotificationRequest;
import com.adyen.examples.model.BalanceAccountNotificationRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

/**
 * Handling different AfP webhooks
 */
@Service
public class EventHandler {

    // cache destination type
    private static final TypeReference<AccountHolderNotificationRequest> ACCOUNT_HOLDER_NOTIFICATION_REQUEST_TYPE =
            new TypeReference<>() {};
    private static final TypeReference<BalanceAccountNotificationRequest> BALANCE_ACCOUNT_NOTIFICATION_REQUEST_TYPE =
            new TypeReference<>() {};

    public AccountHolderNotificationRequest getAccountHolderNotificationRequest(String json) throws InvalidWebhookTypeException, JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(json);
        JsonNode type = jsonNode.get("type");

        if (!isAccountHolderWebhook(type)) {
            throw new InvalidWebhookTypeException("Unexpected webhook type: " + type);
        }

        return objectMapper.readValue(json, ACCOUNT_HOLDER_NOTIFICATION_REQUEST_TYPE);
    }

    public BalanceAccountNotificationRequest getBalanceAccountNotificationRequest(String json) throws InvalidWebhookTypeException, JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(json);
        JsonNode type = jsonNode.get("type");

        if (!isABalanceAccountWebhook(type)) {
            throw new InvalidWebhookTypeException("Unexpected webhook type: " + type);
        }

        return objectMapper.readValue(json, BALANCE_ACCOUNT_NOTIFICATION_REQUEST_TYPE);
    }


    boolean isAccountHolderWebhook(JsonNode type) {
        return type != null && type.asText().startsWith("balancePlatform.accountHolder.");
    }

    boolean isABalanceAccountWebhook(JsonNode type) {
        return type != null && type.asText().startsWith("balancePlatform.balanceAccount.");
    }
}

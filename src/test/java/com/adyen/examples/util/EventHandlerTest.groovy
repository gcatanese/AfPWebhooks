package com.adyen.examples.util

import com.adyen.examples.exception.InvalidWebhookTypeException;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EventHandlerTest extends spock.lang.Specification {

    EventHandler eventHandler = new EventHandler()

    def "getBalanceAccountNotificationRequest"() {
        given:
        def json = "{\n" +
                "    \"data\": {\n" +
                "        \"balancePlatform\": \"myBalancePlatform\",\n" +
                "        \"balanceAccount\": {\n" +
                "            \"accountHolderId\": \"AH3227C223222B5CZW72CCC73\",\n" +
                "            \"defaultCurrencyCode\": \"EUR\",\n" +
                "            \"id\": \"BA3227C223222B5CZW72VCC75\",\n" +
                "            \"status\": \"Active\"\n" +
                "        }\n" +
                "    },\n" +
                "    \"environment\": \"test\",\n" +
                "    \"type\": \"balancePlatform.balanceAccount.created\"\n" +
                "}";
        when:
        def event = eventHandler.getBalanceAccountNotificationRequest(json)
        then:
        event.getType().value == "balancePlatform.balanceAccount.created"
    }

    // check webhook mismatch
    def "getBalanceAccountNotificationRequestError"() {
        given:
        def accountHolder_json = "{\n" +
                "    \"data\": {\n" +
                "        \"balancePlatform\": \"myBalancePlatform\",\n" +
                "        \"accountHolder\": {\n" +
                "            \"description\": \"Shelly Eller\",\n" +
                "            \"legalEntityId\": \"le01\",\n" +
                "            \"reference\": \"1234567890\",\n" +
                "            \"id\": \"AH32272223222B5CZW6QZ2V34\",\n" +
                "            \"status\": \"Active\"\n" +
                "        }\n" +
                "    },\n" +
                "    \"environment\": \"test\",\n" +
                "    \"type\": \"balancePlatform.accountHolder.created\"\n" +
                "}";
        when:
        def event = eventHandler.getBalanceAccountNotificationRequest(accountHolder_json)
        then:
        thrown InvalidWebhookTypeException
    }

}

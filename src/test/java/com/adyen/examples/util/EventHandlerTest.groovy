package com.adyen.examples.util

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EventHandlerTest extends spock.lang.Specification {

    EventHandler eventHandler = new EventHandler()

    def "getEventType"() {
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
                "}"
        when:
        def event = eventHandler.getEventType(json)
        then:
        event == "balancePlatform.balanceAccount.created"
    }

    def "getEventEnvironment"() {
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
                "}"
        when:
        def environment = eventHandler.getEventEnvironment(json)
        then:
        environment == "test"
    }

}

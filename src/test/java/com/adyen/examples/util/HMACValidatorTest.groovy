package com.adyen.examples.util

import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class HMACValidatorTest extends spock.lang.Specification {

    HMACValidator hmacValidator = new HMACValidator()

    def "CalculateHMAC"() {
        given:
        def key = "6D5BADA576A73109D879220DCB793FFD67DEF7AA18C74CCC0AB66FD87AC8AEEA"
        def payload = "{\n" +
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
        def final EXPECTED = "nvsZjQiHBuscSdtcA2cl1E+PSLJfgjPeRdd0pSaRiA0="
        when:
        def signature = hmacValidator.calculateHMAC(payload, key)
        then:
        signature == EXPECTED
    }

    def "ValidateHMAC"() {
        given:
        def payload = "{\n" +
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
        def key = "6D5BADA576A73109D879220DCB793FFD67DEF7AA18C74CCC0AB66FD87AC8AEEA"
        def final signature = "nvsZjQiHBuscSdtcA2cl1E+PSLJfgjPeRdd0pSaRiA0="
        when:
        def valid = hmacValidator.validateHMAC(payload, signature, key)
        then:
        valid
    }

}

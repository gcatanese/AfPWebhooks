package com.adyen.examples.util

import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class HMACValidatorTest extends spock.lang.Specification {

    HMACValidator hmacValidator = new HMACValidator()

    def "CalculateHMAC"() {
        given:
        def key = "6D5BADA576A73109D879220DCB793FFD67DEF7AA18C74CCC0AB66FD87AC8AEEA"
        def payload = "{\"data\":{\"balancePlatform\":\"YourBalancePlatform\",\"creationDate\":\"2022-11-21T16:48:35+01:00\",\"id\":\"3JERI45WZHNCUHZY\",\"accountHolder\":{\"description\":\"Farah's Fedoras Company Account Holder\",\"id\":\"AH3227C223222C5GXTQM35ZX3\"},\"amount\":{\"currency\":\"EUR\",\"value\":900},\"balanceAccount\":{\"description\":\"Farah's Fedoras Balance Account\",\"id\":\"BA32272223222C5GXTQM43WKF\"},\"description\":\"Porcelain Doll: Eliza (20cm)\",\"originalAmount\":{\"currency\":\"EUR\",\"value\":900},\"platformPayment\":{\"account\":\"BA32272223222C5GXTQM43WKF\",\"modificationMerchantReference\":\"<auto>\",\"modificationPspReference\":\"G8X8VXGN2MQ7C782\",\"paymentMerchantReference\":\"uniqueReference\",\"paymentPspReference\":\"H42JQZ4RTGXXGN82\",\"reference\":\"6124145\",\"type\":\"BalanceAccount\"},\"reference\":\"6124145\",\"status\":\"Authorised\"},\"environment\":\"test\",\"type\":\"balancePlatform.payment.created\"}";
        def final EXPECTED = "lFrZb+1R+3Hfnbh+VM4Jt5qZYre5r3Lu5RJeQQSsl6M="
        when:
        def signature = hmacValidator.calculateHMAC(payload, key)
        then:
        signature == EXPECTED

    }

    def "ValidateHMAC"() {
        given:
        def payload = "{\"data\":{\"balancePlatform\":\"YourBalancePlatform\",\"creationDate\":\"2022-11-21T16:48:35+01:00\",\"id\":\"3JERI45WZHNCUHZY\",\"accountHolder\":{\"description\":\"Farah's Fedoras Company Account Holder\",\"id\":\"AH3227C223222C5GXTQM35ZX3\"},\"amount\":{\"currency\":\"EUR\",\"value\":900},\"balanceAccount\":{\"description\":\"Farah's Fedoras Balance Account\",\"id\":\"BA32272223222C5GXTQM43WKF\"},\"description\":\"Porcelain Doll: Eliza (20cm)\",\"originalAmount\":{\"currency\":\"EUR\",\"value\":900},\"platformPayment\":{\"account\":\"BA32272223222C5GXTQM43WKF\",\"modificationMerchantReference\":\"<auto>\",\"modificationPspReference\":\"G8X8VXGN2MQ7C782\",\"paymentMerchantReference\":\"uniqueReference\",\"paymentPspReference\":\"H42JQZ4RTGXXGN82\",\"reference\":\"6124145\",\"type\":\"BalanceAccount\"},\"reference\":\"6124145\",\"status\":\"Authorised\"},\"environment\":\"test\",\"type\":\"balancePlatform.payment.created\"}";
        def key = "6D5BADA576A73109D879220DCB793FFD67DEF7AA18C74CCC0AB66FD87AC8AEEA"
        def final signature = "lFrZb+1R+3Hfnbh+VM4Jt5qZYre5r3Lu5RJeQQSsl6M="
        when:
        def valid = hmacValidator.validateHMAC(payload, signature, key)
        then:
        valid

    }

}

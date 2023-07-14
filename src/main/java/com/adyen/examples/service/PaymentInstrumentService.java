package com.adyen.examples.service;

import com.adyen.model.configurationwebhooks.PaymentInstrumentNotificationData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PaymentInstrumentService {

    private final Logger logger = LoggerFactory.getLogger(PaymentInstrumentService.class);

    public void createPaymentInstrument(PaymentInstrumentNotificationData data) {
        // create new PaymentInstrument
    }

    public void updatePaymentInstrument(PaymentInstrumentNotificationData data) {
        // update existing PaymentInstrument
    }
}

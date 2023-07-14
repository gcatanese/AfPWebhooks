package com.adyen.examples.service;

import com.adyen.model.configurationwebhooks.AccountHolderNotificationData;
import com.adyen.model.transferwebhooks.TransferData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TransferService {

    private final Logger logger = LoggerFactory.getLogger(TransferService.class);

    public void createTransfer(TransferData data) {
        // create new Transfer
    }

    public void updateTransfer(TransferData data) {
        // update existing Transfer
    }
}

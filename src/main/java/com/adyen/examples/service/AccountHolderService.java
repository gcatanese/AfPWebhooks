package com.adyen.examples.service;

import com.adyen.model.configurationwebhooks.AccountHolderNotificationData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
@Service
public class AccountHolderService {

    private final Logger logger = LoggerFactory.getLogger(AccountHolderService.class);

    public void createAccoundHolder(AccountHolderNotificationData data) {
        // create new AccountHolder
    }

    public void updateAccoundHolder(AccountHolderNotificationData data) {
        // update existing AccountHolder
    }
}

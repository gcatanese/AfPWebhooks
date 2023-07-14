package com.adyen.examples.service;

import com.adyen.model.configurationwebhooks.BalanceAccountNotificationData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BalanceAccountService {

    private final Logger logger = LoggerFactory.getLogger(BalanceAccountService.class);

    public void createBalanceAccount(BalanceAccountNotificationData data) {
        // create new BalanceAccount
    }

    public void updateBalanceAccount(BalanceAccountNotificationData data) {
        // update existing BalanceAccount
    }
}

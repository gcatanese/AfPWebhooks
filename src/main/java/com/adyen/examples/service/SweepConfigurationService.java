package com.adyen.examples.service;

import com.adyen.model.configurationwebhooks.SweepConfigurationNotificationData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SweepConfigurationService {
    private final Logger logger = LoggerFactory.getLogger(SweepConfigurationService.class);

    public void createSweepConfiguration(SweepConfigurationNotificationData data) {
        // create new SweepConfiguration
    }

    public void updateSweepConfiguration(SweepConfigurationNotificationData data) {
        // update existing SweepConfiguration
    }

    public void deleteSweepConfiguration(SweepConfigurationNotificationData data) {
        // update delete SweepConfiguration
    }
}

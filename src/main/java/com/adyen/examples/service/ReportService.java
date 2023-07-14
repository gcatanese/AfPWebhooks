package com.adyen.examples.service;

import com.adyen.model.reportwebhooks.ReportNotificationData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    private final Logger logger = LoggerFactory.getLogger(ReportService.class);

    // A report was generated and is ready to be downloaded.
    public void getGeneratedReport(ReportNotificationData data) {
    }

}

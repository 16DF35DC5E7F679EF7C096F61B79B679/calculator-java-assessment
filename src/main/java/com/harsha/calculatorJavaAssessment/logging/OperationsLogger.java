package com.harsha.calculatorJavaAssessment.logging;

import com.harsha.calculatorJavaAssessment.FileFormat;
import com.harsha.calculatorJavaAssessment.LoggingStrategy;
import com.harsha.calculatorJavaAssessment.Operation;
import com.harsha.calculatorJavaAssessment.logging.fileCreator.LogfileCreator;
import com.harsha.calculatorJavaAssessment.logging.fileCreator.LogfileCreatorFactory;
import com.harsha.calculatorJavaAssessment.logging.notification.MailSender;
import com.harsha.calculatorJavaAssessment.logging.notification.NotificationsSender;

import java.util.List;

public class OperationsLogger {

    LogfileCreator logfileCreator;

    NotificationsSender notificationsSender;

    public OperationsLogger() {
    }

    private LogfileCreator getLogfileCreator(FileFormat fileFormat) {
        if (logfileCreator == null) {
            logfileCreator = LogfileCreatorFactory.create(fileFormat);
        }
        return logfileCreator;
    }

    private NotificationsSender getNotificationsSender() {
        if (notificationsSender == null) {
            notificationsSender = new MailSender();
        }
        return notificationsSender;
    }

    public void logOperations(List<Operation> operations, LoggingStrategy loggingStrategy) {
        //TODO get logfile creator instance and create file
        //TODO create an instance of Notification
        //TODO Obtain an instance of notification sender and send notification
    }
}

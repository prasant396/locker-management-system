package com.example.restservice.Services;

import com.example.restservice.model.locker.LockerNotificationDetails;

public class NotificationService {


    private void notifyUser(String lockerId){
        //TODO: generate random number otp
        long otp = 123;
        final LockerNotificationDetails lockerNotificationDetails = new LockerNotificationDetails(lockerId, otp);
        sendEvent(lockerNotificationDetails);
    }

    private void sendEvent(LockerNotificationDetails lockerNotificationDetails) {
        //TODO. send the notification to event bus asynch and trakc the notification status
    }

}

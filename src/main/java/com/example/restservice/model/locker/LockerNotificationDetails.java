package com.example.restservice.model.locker;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LockerNotificationDetails {
    private final String lockerId;
    private final long lockerOtp;
}

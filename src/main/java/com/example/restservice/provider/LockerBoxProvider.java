package com.example.restservice.provider;

import com.example.restservice.model.locker.LockerBox;

public interface LockerBoxProvider {
    LockerBox getLockerBox(String lockerBoxId);

    boolean isValidLockerBox(String lockerBoxId);
}

package com.example.restservice.model.locker;

import lombok.Getter;

@Getter
public class Locker {
    String id;
    LockerType lockerType;
    boolean isAvailable;
}

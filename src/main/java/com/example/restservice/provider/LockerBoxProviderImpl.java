package com.example.restservice.provider;

import com.example.restservice.model.locker.LockerBox;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Service

public class LockerBoxProviderImpl implements LockerBoxProvider {

    private final Map<String, LockerBox> lockerBoxMap;
    private final Set<String> lockerBoxes;

    public LockerBoxProviderImpl() {
        this.lockerBoxMap = new ConcurrentHashMap<>();
        this.lockerBoxes = new HashSet<>();
    }

    @Override
    public LockerBox getLockerBox(String lockerBoxId) {
        return lockerBoxMap.get(lockerBoxId);
    }

    @Override
    public boolean isValidLockerBox(String lockerBoxId) {
        return lockerBoxes.contains(lockerBoxId);
    }
}

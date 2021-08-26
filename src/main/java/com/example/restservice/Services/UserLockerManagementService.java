package com.example.restservice.Services;

import com.example.restservice.model.item.Items;

import java.util.List;

public interface UserLockerManagementService {

     String getLocker(String lockerBoxId, Items items);
     List<String> getLockers(String lockerBoxId, List<Items> items);
}

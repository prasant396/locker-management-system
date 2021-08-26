package com.example.restservice.controller;

import com.example.restservice.Services.UserLockerManagementService;
import com.example.restservice.model.item.Items;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserLockerController {

    private final UserLockerManagementService lockerManagementService;

    @GetMapping(value = "path")
    private String getLocker(String lockerBoxId, Items item){
        final String lockerId = lockerManagementService.getLocker(lockerBoxId, item);
        return lockerId;
    }

    @GetMapping(value = "path")
    private String getLockers(String lockerBoxId, List<Items> items){
        final List<String> lockers = lockerManagementService.getLockers(lockerBoxId, items);
        return lockers.toString();
    }

}

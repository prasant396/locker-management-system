package com.example.restservice.Services;

import com.example.restservice.model.exception.InvalidLockerBoxException;
import com.example.restservice.model.item.Items;
import com.example.restservice.model.locker.LockerBox;
import com.example.restservice.provider.LockerBoxProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserLockerManagementServiceImpl implements UserLockerManagementService {
    private final LockerBoxProvider lockerBoxProvider;
    private final NotificationService notificationService;

    //DAta storage to have locker
    @Override
    public String getLocker(String lockerBoxId, Items item) {
        if(!lockerBoxProvider.isValidLockerBox(lockerBoxId)){
            throw new InvalidLockerBoxException();
        };

        final LockerBox lockerBox = lockerBoxProvider.getLockerBox(lockerBoxId);
        lockerBox.getAvailableLocker(item.getItemSize());
        //.getLocker(item.getItemSize());
        // get the locker based on the item size
        // return lockerId

        return null;
    }

    @Override
    public List<String> getLockers(String lockerBoxId, List<Items> items) {
        return null;
    }
}

package com.example.restservice.model.locker;

import com.example.restservice.model.account.Address;
import com.example.restservice.model.item.ItemSize;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class LockerBox {
    String lockerBoxId;
    Address address;
    List<Locker> lockers;

    public void getAvailableLocker(ItemSize itemSize) {
        final LockerType lockerType = getLockerType(itemSize);
    }

    private LockerType getLockerType(ItemSize itemSize) {
//        switch (itemSize)
//        case:
        return null;
    }
}

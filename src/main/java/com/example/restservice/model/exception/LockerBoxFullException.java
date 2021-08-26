package com.example.restservice.model.exception;

public class LockerBoxFullException extends RuntimeException {
    @Override
    public String getMessage() {
        return ExceptionType.LOCKER_BOX_FULL.toString();
    }
}

package com.example.restservice.support;

import java.time.Duration;
import java.time.LocalDateTime;

public class TimeSupport {
    public static long timeTakenInMillis(LocalDateTime startTime) {
        return Duration.between(startTime, LocalDateTime.now()).toMillis();
    }
}

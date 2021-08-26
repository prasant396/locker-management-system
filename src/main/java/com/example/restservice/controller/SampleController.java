package com.example.restservice.controller;

import com.example.restservice.model.account.Sample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

import static com.example.restservice.support.TimeSupport.timeTakenInMillis;

@Slf4j
@RestController
public class SampleController {
    private static final String template = "Hello, %s!";
    private static final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = RequestMethod.GET, value = "/greeting")
    public Sample greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        final LocalDateTime startTime = LocalDateTime.now();
        final Sample sampleResponse = new Sample(counter.incrementAndGet(), String.format(template, name));
        log.info("Time taken to greet: {} ms", timeTakenInMillis(startTime));
        return sampleResponse;
    }

}

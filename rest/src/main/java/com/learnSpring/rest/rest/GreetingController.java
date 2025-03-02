package com.learnSpring.rest.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s! Userid- %s";

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(defaultValue = "User") String name,
                             @RequestParam (defaultValue = "getAPI") String method) {
        Long id = counter.incrementAndGet();
        return new Greeting(id, String.format(template, name, method));
    }
}

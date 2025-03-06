package com.learnSpring.restApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitialController {
    @GetMapping("/")
    public String initiaReq(){
        return "Hello!";
    }
}

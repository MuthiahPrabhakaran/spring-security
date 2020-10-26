package com.spring.security.basicauthentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
    @GetMapping
    public String justReturnSomething(){
        return "Hello World";
    }
}

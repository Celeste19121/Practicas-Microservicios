package com.code.spring.app.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Holamundo {
@GetMapping("/")
public String getMethodName(@RequestParam String param) {
    return new String("holamundo code");
}

    
}

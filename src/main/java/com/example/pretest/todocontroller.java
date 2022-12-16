package com.example.pretest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class todocontroller {
    @GetMapping
    public String hellotodo() {
        return "To-do application !!!!";
    }
}

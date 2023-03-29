package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MerhabaApi {

    @GetMapping
    public String esen() {
        return "esenlikler dilerim";
    }
}

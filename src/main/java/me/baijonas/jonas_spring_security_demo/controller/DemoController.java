package me.baijonas.jonas_spring_security_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jonas")
public class DemoController {

    @GetMapping
    public String home() {
        return "<h1>HELLO!</h1>";
    }

    @GetMapping
    @RequestMapping("/user")
    public String user() {
        return "<h1>HELLO! USER</h1>";
    }

    @GetMapping
    @RequestMapping("/admin")
    public String admin() {
        return "<h1>HELLO! ADMIN!</h1>";
    }
}

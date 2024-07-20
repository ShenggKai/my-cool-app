package com.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FunRestController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello me";
    }

    @GetMapping("/work")
    public String work() {
        return "a";
    }
}

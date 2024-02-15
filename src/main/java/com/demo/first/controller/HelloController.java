package com.demo.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
// to remove all unused imports use - ctrl+alt+O
//controllers are just not classes they are resources
@RestController
public class HelloController {

    //@RequestMapping(value="/",method= RequestMethod.GET)
    @GetMapping("/")
    public String helloWorld(){
        return "Welcome to First SpringBoot application";
    }
}

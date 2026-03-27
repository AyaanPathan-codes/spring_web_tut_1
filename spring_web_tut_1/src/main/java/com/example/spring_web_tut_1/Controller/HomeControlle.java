package com.example.spring_web_tut_1.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControlle {

    @RequestMapping("/")
    public String greet(){

        return "Hello World";
    }

    @RequestMapping("/about")
    public String about(){

        return "About !!";
    }



}

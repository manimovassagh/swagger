package com.github.manimovassagh.yasintest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class StudentController {



    @GetMapping("/test")
    public String testController(){
        return "Hi It is my new controller";
    }
}

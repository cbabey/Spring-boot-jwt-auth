package com.cbabey.Springbootjwtexample.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @RequestMapping("/testingJWTendPoint")
    public String testingJWTendPoint(){
        return "You are accepted from This end point";
    }




}

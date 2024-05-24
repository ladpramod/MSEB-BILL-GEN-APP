package com.mseb.bill.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class userController {

    @GetMapping("/greet")
    public String hello(){
        return "index";
    }




}

package com.example.mdmd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class sdController {
    @GetMapping("sd")
    public String sd(){
        return "sd";
    }

    @GetMapping("sd2")
    public String sd2(){
        return "sd2";

    }




}

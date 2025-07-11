package com.example.mdmd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class sdController {
    @GetMapping("sd")

    public String sd(){
        return "sd";
    }


}

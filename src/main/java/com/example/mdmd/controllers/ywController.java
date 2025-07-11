package com.example.mdmd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ywController {
    @GetMapping("ywController")

    public String yw(){
        return "yw";
    }

}

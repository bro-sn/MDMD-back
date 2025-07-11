package com.example.mdmd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class nnController {
    @GetMapping("nn")
    public String nn(){
        return "nn";
    }

    
}

package com.example.mdmd.controllers;

import com.example.mdmd.PracRepository0731;
import com.example.mdmd.model.Prac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PracController0731 {

    @Autowired
    PracRepository0731 PracRepository0731;

   
    @GetMapping("/prac")
    @ResponseBody
    public Prac prAdd(@ModelAttribute PracRepository0731 pr) {
        Prac result = PracRepository0731.save(pr);
        return result;
    }   //모르겠다
    

}

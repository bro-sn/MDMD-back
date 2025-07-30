package com.example.mdmd.controllers;

import com.example.mdmd.model.PracEntity;
import com.example.mdmd.service.PracService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PracController {

    private PracService pracService;

    @Autowired
    public void setPracService(PracService pracService) {
        this.pracService = pracService;
    }

    @GetMapping("/prac")
    private String prac(Model model){

        return "prac";
    }

    @PostMapping("/prac")
    private void pracPost(@RequestParam("date") String date,
                        @RequestParam("name") String name, Model model){
        System.out.println(date + " " + name);  //테스트

        PracEntity pe = new PracEntity();
        pe.setName(name);
        pe.setDate(date);

        //인프런 강의(스프링 입문)에서 본 방법으로 만듬
        //Service를 통해서 Repository 연결하는 방법

        pracService.save(pe);

    }

    @GetMapping("/PlusA")
    private String plusA(@RequestParam(defaultValue = "1", name = "page", required = false) int page, Model model){
        model.addAttribute("page", page);

        return "plusA";
    }


}

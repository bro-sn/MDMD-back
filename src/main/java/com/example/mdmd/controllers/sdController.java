package com.example.mdmd.controllers;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @Setter
    @Getter
    static class Book{
        private String name;
        private int num;

    }

    @GetMapping("sd-obj")
    @ResponseBody
    public Book sdObj(){
        Book b = new Book();
        b.setName("aabb");
        b.setNum(1234);
        return b;
    }




}

package com.example.mdmd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HsController {

//    localhost:8080/url에 접속 할 이름 (여기서는 hs)
    @GetMapping("hs")
    public String hs(){
//        return "접속하고 싶은 html파일 이름"
        return "hs";
    }
}


//여기까지 완료했으면 resources/templates/ 여기서 새파일 ->return 이후 작성한 파일이름.html 입력
//html 파일을 작성한다.

// 만든 파일 접속 방법 : localhost:8080/GeMapping에있는 단어 -> return 이후 적힌 단어 이름으로 되어있는 html파일이 열린다.
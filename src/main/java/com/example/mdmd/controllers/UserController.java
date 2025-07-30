package com.example.mdmd.controllers;

import com.example.mdmd.model.PracUser;
import com.example.mdmd.repository.PracUserRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private PracUserRepository pracUserRepository;

    @Autowired
    private HttpSession session;

    // 로그인 페이지 주소 지정 및 해당 html파일로 보내기
    @GetMapping("/signin")
    public String signin() {
        return "signin"; // templates/signin.html
    }

    // 로그인 처리
    @PostMapping("/signin")
    public String loginPost(@ModelAttribute PracUser pracUser) {
        PracUser dbUser = pracUserRepository.findByUserIdAndPassword(pracUser.getUserId(), pracUser.getPassword());

        if (dbUser != null) {
            session.setAttribute("user_info", dbUser);
        }

        return "redirect:/hs"; // 로그인 성공 시 보내고 싶은 html파일 주소
    }

    // 회원가입 페이지 주소 지정 및 해당 html파일로 보내기
    @GetMapping("/signup")
    public String signup() {
        return "signup"; // templates/signup.html
    }

    // 회원가입 처리
    @PostMapping("/signup")
    public String signupPost(@ModelAttribute PracUser pracUser) {
        pracUserRepository.save(pracUser);
        return "redirect:/signin";
    }
}
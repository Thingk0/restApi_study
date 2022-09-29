package com.springboot.restapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;



@Slf4j
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Locale locale, Model model) {

        // 현재시간 가져오기.
        LocalDateTime now = LocalDateTime.now();

        // 포매팅 패턴만들어서 현재시간에 적용하기.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 (E) a h시 m분 s초");
        String formattedNow = now.format(formatter);

        //  "serverTime" 에 담아서 템플릿에 value 전달.
        model.addAttribute("serverTime", formattedNow);
        return "home";
    }
}

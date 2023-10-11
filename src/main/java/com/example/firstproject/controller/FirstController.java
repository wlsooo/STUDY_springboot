package com.example.firstproject.controller;

//컨트롤러 선언과 동시에 자동으로 임포트
import org.springframework.stereotype.Controller;
// URL 연결 요청(@GetMapping())과 동시에 자동으로 임포트
import org.springframework.web.bind.annotation.GetMapping;
// Model 임포트, 모델 변수 등록 가능
import org.springframework.ui.Model;

@Controller //컨트롤러 선언
public class FirstController {
    
    @GetMapping("/hi") //url 요청 접수, localhost:8080/hi로 접속
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "hongpark");
        return "greetings"; //greetings.mustache 파일 반환
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "hongpark");
        return "goodbye";
    }
}

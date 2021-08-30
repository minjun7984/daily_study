package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //html 페이지 리소스 찾게됨
public class PageController {

    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    //ResponseEntity
    @ResponseBody
    @GetMapping("/user")
    public User user(){
        var user = new User();
        user.setName("STEVE");
        user.setAddress("인천광역시");
        return user;
    }
}

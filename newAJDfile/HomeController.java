package com.ajd.meow.controller;

import com.ajd.meow.entity.UserMaster;
import com.ajd.meow.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;
    @GetMapping("/")
    public String home(HttpSession session){
        if(session.getAttribute("user")==null){
            return "index";
        }else{
            return "index_login";
        }
    }
    @GetMapping("sign.meow")
    public String memberSign(
    ){
        return "sign";
    }
//    @GetMapping("login.meow")
//    public String logIn(
//    ){
//        return "join";
//    }
    @PostMapping("sign_success.meow")
    public String signSuccess(UserMaster user){
        userService.insertMember(user);
        return "sign_success";
    }
}

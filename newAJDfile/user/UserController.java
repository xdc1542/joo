package com.ajd.meow.controller.user;

import com.ajd.meow.entity.UserMaster;
import com.ajd.meow.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user/*")
public class UserController {
    private UserService userService;

    @GetMapping("sign.meow")
    public String memberSign(){
        return "sign";
    }

    @PostMapping("sign_success.meow")
    public String memberSignSuccess(UserMaster user){
        userService.insertMember(user);
        return "sign_success";
    }

    @GetMapping("findid.meow") // 아이디, 비번찾기
    public String findId(){
        return "find_id";
    }

    @PostMapping("findid.meow")
    public String findID(@RequestParam String name, String email){

        return "id_find";
    }

    @PostMapping("findpw.meow")
    public String findPW(){
        return "리다이랙트:";
    }
}

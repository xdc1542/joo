package com.ajd.meow.controller.user;

import com.ajd.meow.entity.UserMaster;
import com.ajd.meow.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("sign.meow")
    public String memberSign(){
        return "sign";
    }

    @PostMapping("sign_success.meow")
    public String memberSignSuccess(/*@ModelAttribute */UserMaster user, MultipartFile file)throws Exception{
        userService.insertMember(user, file);
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


    // 회원 목록
    @GetMapping("user_list.meow")
    public String findAll(Model model){
        List<UserMaster> userMasterList = userService.findAll();
        model.addAttribute("userList", userMasterList);
        return "user_list";
    }
    // 회원 정보 상세 보기
    @GetMapping("/userMaster/{userNo}")
    public String findByUserNo(@PathVariable Long userNo, Model model){
        UserMaster userMaster = userService.findByUserNo(userNo);
        model.addAttribute("userMaster", userMaster);

        return "admin_user_detail";
    }


}

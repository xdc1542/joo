package com.ajd.meow.controller.donate;

import com.ajd.meow.entity.UserMaster;
import com.ajd.meow.repository.donate.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/index")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/join")
    public String join(@RequestBody UserMaster userMaster){
        UserMaster newUser= userRepository.save(userMaster);

        return userMaster.getUserName() + "님의 회원가입을 축하드립니다.";
    }

    public String findUser(){
        return null;
    }
    @GetMapping("/User")
    public UserMaster findUser(@RequestParam Long id){
        Optional<UserMaster> userMaster = userRepository.findById(id);

        return userMaster.get();
    }
    @PutMapping("/User")
    public Optional<UserMaster> changeInfo(@RequestParam Long userNo,@RequestBody UserMaster userMaster){

        Optional<UserMaster> updateUser = userRepository.findById(userNo);

        updateUser.ifPresent(selectUser->{
            selectUser.setUserName(userMaster.getUserName());
            selectUser.setUserId(userMaster.getUserId());
            selectUser.setGender(userMaster.getGender());
            selectUser.setNickName(userMaster.getNickName());
            selectUser.setPhoneNumber(userMaster.getPhoneNumber());
            selectUser.setUserType(userMaster.getUserType());

            userRepository.save(selectUser);

        });

        return updateUser;
    }

}

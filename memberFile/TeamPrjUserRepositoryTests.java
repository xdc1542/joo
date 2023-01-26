package com.ajd.meow.user.repository;

import com.ajd.meow.MeowApplicationTests;
import com.ajd.meow.entity.UserMaster;
import com.ajd.meow.repository.donate.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Optional;

public class UserRepositoryTests extends MeowApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test void Create(){
        UserMaster user = new UserMaster();

        user.setUserType("admin");
        user.setUserId("walwalzoo@naver.com");
        user.setUserPassword("Joonseong@0906");
        user.setUserName("준성");
        user.setNickName("준성");
        user.setGender("남");
        user.setPhoneNumber("010-1234-5678");
        user.setPhoneType("SKT");
        user.setBirthDate(Date.valueOf(LocalDate.now()));
        user.setUserJoinDate(LocalDateTime.now());

        UserMaster newUserMaster = userRepository.save(user);
    }

    @Test
    public void read(){
        Optional<UserMaster> userMaster= userRepository.findById(8L);

        userMaster.ifPresent(selectUser->{
            System.out.println(selectUser.getUserNo());
            System.out.println(selectUser.getUserType());
            System.out.println(selectUser.getUserId());
            System.out.println(selectUser.getUserPassword());
            System.out.println(selectUser.getUserName());
            System.out.println(selectUser.getNickName());
            System.out.println(selectUser.getGender());
            System.out.println(selectUser.getPhoneNumber());
            System.out.println(selectUser.getPhoneType());
            System.out.println(selectUser.getBirthDate());
            System.out.println(selectUser.getUserJoinDate());
        });
    }

    @Test
    public void update(){
        Optional<UserMaster> userMaster=userRepository.findById(8L);

        userMaster.ifPresent(selectUser->{
            selectUser.setUserName("박준성");
            selectUser.setGender("여");

            userRepository.save(selectUser);

        });
    }
    @Test
    public void delete(){
        Optional<UserMaster> userMaster = userRepository.findById(9L);

        userMaster.ifPresent(selectUser ->{
            userRepository.delete(selectUser);

        });
    }
}

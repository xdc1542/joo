package com.ajd.meow.service.user;

import com.ajd.meow.entity.UserMaster;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface UserService {

    void insertMember(UserMaster user, MultipartFile file) throws Exception;
    void updateMember(UserMaster user, MultipartFile file);
    void deleteMember(UserMaster user);

    long getTotalRowCount(/*UserMaster user*/); //  유저 회원수 조회
    UserMaster getUserMaster(UserMaster user); // 유저 정보 가져오기

    List<UserMaster> findAll();

    UserMaster findByUserNo(Long userNo);


    //페이징
}

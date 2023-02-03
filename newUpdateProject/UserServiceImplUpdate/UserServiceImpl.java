package com.ajd.meow.service.user;

import com.ajd.meow.entity.UserMaster;
import com.ajd.meow.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void insertMember(UserMaster user, MultipartFile file) throws Exception {

        String prfImgPath = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\img";

        UUID uuid = UUID.randomUUID();

        String fileName = uuid + "_" + file.getOriginalFilename();

        File saveFile = new File(prfImgPath, fileName);
        file.transferTo(saveFile);

        user.setProfileImageName(fileName);
        user.setProfileImagePath("/img/" + fileName);


        user.setUserJoinDate(LocalDateTime.now());
        user.setUserType("MEMBER");
        userRepository.save(user);
    }

    @Override
    public void updateMember(UserMaster user, MultipartFile file){
        Optional<UserMaster> useruser=userRepository.findByUserName(user.getUserName());
        useruser.get().setNickName(user.getNickName());
        useruser.get().setDetailAddress(user.getDetailAddress());
        useruser.get().setPhoneType(user.getPhoneType());
        useruser.get().setPhoneNumber(user.getPhoneNumber());
        useruser.get().setUserPassword(user.getUserPassword());
        useruser.get().setIntroduce(user.getIntroduce());
        useruser.get().setProfileImageName(user.getProfileImageName());
        userRepository.save(useruser.get());
        }

    @Override
    public void deleteMember(UserMaster user) {
        userRepository.deleteById(user.getUserNo());
    }

    @Override
    public long getTotalRowCount() {
        return userRepository.count();
    }

    @Override
    public UserMaster getUserMaster(UserMaster user) {
        //Optional<UserMaster> findUser=userRepository.findById(user.getUserNo());
        Optional<UserMaster> findUser=userRepository.findByUserId(user.getUserId());
        /*if(findUser.isPresent()){return findUser.get();}
        else {return null;}*/
        if(findUser.isPresent()){return findUser.get();}
        else {return null;}
    }

    @Override
    public List<UserMaster> findAll() {
        List<UserMaster> userMasterList = userRepository.findAll();

        return userMasterList;
    }

    @Override
    public UserMaster findByUserNo(Long userNo) {
        Optional<UserMaster> optionalUserMaster = userRepository.findByUserNo(userNo);
        if(optionalUserMaster.isPresent()){
            UserMaster userMaster = optionalUserMaster.get();

            return userMaster;

        }else {
            return null;
        }
    }


}

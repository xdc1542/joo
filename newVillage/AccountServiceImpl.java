package com.ajd.meow.service.user;

import com.ajd.meow.controller.user.AccountController;
import com.ajd.meow.entity.UserMaster;

public class AccountServiceImpl implements AccountService{

    @Override
    public UserMaster userIdSearch(UserMaster userMaster){
        return AccountService.userIdSearch(userMaster);
    }
}

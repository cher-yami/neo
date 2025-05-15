package com.ccstudent.msauth.service;

import com.ccstudent.msauth.dto.AuthUserDto;
import com.ccstudent.msauth.entity.AuthUser;
import com.ccstudent.msauth.entity.TokenDto;

public interface AuthUserService {
    public AuthUser save(AuthUserDto authUserDto);


    public TokenDto login(AuthUserDto authUserDto);


    public TokenDto validate(String token);
}



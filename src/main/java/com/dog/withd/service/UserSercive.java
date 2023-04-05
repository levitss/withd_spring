package com.dog.withd.service;


import com.dog.withd.Mapper.MapperUser;
import com.dog.withd.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
@Service
@RequiredArgsConstructor
public class UserSercive {
    Date time = new Date();

    @Autowired
    MapperUser mapperUser;

    public void joinUser(User user) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setAuth("user");
        user.setUpdate(time);
        user.setReg_date(time);
        mapperUser.saveUser(user);
    }




}

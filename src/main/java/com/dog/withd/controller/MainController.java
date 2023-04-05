package com.dog.withd.controller;

import com.dog.withd.domain.User;
import com.dog.withd.service.UserSercive;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MainController {
    @Autowired
    UserSercive userSercive;

    @GetMapping("/main")
    public String mainMapping(){
        return "/main";

    }



@PostMapping("/main")
    public String regUser(User user) {
    userSercive.joinUser(user);

        return "/main";
    }


}

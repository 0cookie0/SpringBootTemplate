package com.javaee.controller;

import com.javaee.po.User;
import com.javaee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public String getAll(){
        System.out.println("进入getAll()");
        List<User> all = userService.getAll();
        User user = userService.getById(1);
        System.out.println(all);
        System.out.println(user);
        return all.toString();
    }


}

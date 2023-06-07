package com.javaee.controller;

import com.javaee.po.User;
import com.javaee.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping
    public List<User> getAll(){
        return userService.list();
    }

    @PostMapping
    /*传过来是json格式*/
    public Boolean save(@RequestBody User user){
        return userService.save(user);
    }

    @DeleteMapping("{id}")
    public Boolean delete(Integer id){
        return userService.removeById(id);
    }

    @PutMapping
    public Boolean update(@RequestBody User user){
        return userService.updateById(user);
    }

    @GetMapping("{id}")
    /*对应url为/user/1*/
    public User getById(Integer id){
        return userService.getById(id);
    }




}

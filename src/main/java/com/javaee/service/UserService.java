package com.javaee.service;

import com.javaee.po.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserService {

    /*获取所有用户信息*/
    List<User> getAll();

}

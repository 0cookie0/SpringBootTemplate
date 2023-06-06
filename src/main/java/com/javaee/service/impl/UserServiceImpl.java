package com.javaee.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.javaee.mapper.UserMapper;
import com.javaee.po.User;
import com.javaee.service.IUserService;
import org.springframework.stereotype.Service;

/*ServiceImpl<持久层接口,模型类>*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}

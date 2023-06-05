package com.javaee.mapper;

import com.javaee.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getAll();

}

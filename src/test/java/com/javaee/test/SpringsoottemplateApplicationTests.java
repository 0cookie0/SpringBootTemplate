package com.javaee.test;

import com.javaee.mapper.UserMapper;
import com.javaee.po.User;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringsoottemplateApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	void selectById() {
		System.out.println(userMapper.selectById(1));
	}

	@Test
	void testSave(){
		User user = new User();
		user.setPassword("2266655");
		user.setUsername("测试mybatis-plus");
		int insert = userMapper.insert(user);
		System.out.println(insert);
	}
	@Test
	void testUpdate(){
		User user = new User();
		user.setId(29);
		user.setPassword("2266655");
		user.setUsername("测试mybatis-plus Upda");
		int update = userMapper.updateById(user);
		System.out.println(update);
	}
	@Test
	void testDelete(){
		int i = userMapper.deleteById(29);
		System.out.println(i);
	}

	@Test
	void testGetAll(){
		List<User> users = userMapper.selectList(null);
		System.out.println(users);
	}

}

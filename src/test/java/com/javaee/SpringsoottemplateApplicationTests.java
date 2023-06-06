package com.javaee;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

	@Test
	void testGetPage(){
		Page page = new Page(1,5);
		/*此功能需要依赖MPConfig,需要注进去一个拦截器的bean*/
		Page page1 = userMapper.selectPage(page, null);
		System.out.println(page1);
		/*当前页*/
		System.out.println(page1.getCurrent());
		/*一共几页*/
		System.out.println(page1.getPages());
		/*数据*/
		System.out.println(page1.getRecords());
		System.out.println(page1.getSize());
		System.out.println(page1.getTotal());

	}

}

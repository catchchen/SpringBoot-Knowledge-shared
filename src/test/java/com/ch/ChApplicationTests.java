package com.ch;

import com.ch.dao.UserDao;
import com.ch.pojo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class ChApplicationTests {

	@Autowired
	UserDao userDao;
	@Test
	void contextLoads() {
//		System.out.println(userDao.selectTestUser().orElseThrow(()->new RuntimeException("---")));
//		Optional<User> chenk = userDao.selectByUsername("testtest");
//		System.err.println("chenk"+chenk.get());

		User user = userDao.selectByEmail("test@test.com").orElseThrow(()->new RuntimeException("问题"));
		System.out.println(user);


	}
	@Test
	void test01(){
	}

}

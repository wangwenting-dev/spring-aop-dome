package com.zqsign.startdome;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zqsign.service.UserService;
@SuppressWarnings("resource")
public class TestAOP {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = context.getBean(UserService.class);
		userService.addUser("admin");
		userService.deleteUser("123456");
	}

}

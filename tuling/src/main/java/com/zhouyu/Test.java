package com.zhouyu;

import com.zhouyu.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;


public class Test {

	public static void main(String[] args) throws IOException {


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		UserService userService = (UserService) context.getBean("userService");
		userService.test();


//
	}

	}









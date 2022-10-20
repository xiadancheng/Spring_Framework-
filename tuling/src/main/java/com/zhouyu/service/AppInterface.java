package com.zhouyu.service;

import org.springframework.context.annotation.Bean;

public interface AppInterface {
	@Bean
	default UserService userService(){
		return new UserService();
	}
}

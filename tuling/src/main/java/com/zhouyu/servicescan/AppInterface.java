package com.zhouyu.servicescan;

import com.zhouyu.service.UserService;
import org.springframework.context.annotation.Bean;

public interface AppInterface {
	@Bean
	default UserService userService(){
		return new UserService();
	}
}

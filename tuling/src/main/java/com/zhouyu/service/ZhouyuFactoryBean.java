package com.zhouyu.service;


import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("userService")
public class ZhouyuFactoryBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		return new UserService();
	}

	@Override
	public Class<?> getObjectType() {
		return UserService.class;
	}
}

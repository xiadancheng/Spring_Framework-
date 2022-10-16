package com.zhouyu;

import com.zhouyu.service.User;
import com.zhouyu.service.UserService;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.SmartFactoryBean;
import org.springframework.stereotype.Component;

//@Component
public class ZhouyuFactoryBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		System.out.println("在启动时调用");
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return UserService.class;
	}

}

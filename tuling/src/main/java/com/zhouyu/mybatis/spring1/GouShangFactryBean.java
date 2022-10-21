package com.zhouyu.mybatis.spring1;

import com.zhouyu.mapper.UserMapper;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//@Component
public class GouShangFactryBean  implements FactoryBean {

	private Class mapperInterface;

	public GouShangFactryBean(Class mapperInterface) {
		this.mapperInterface = mapperInterface;
	}

	@Override
	public Object getObject() throws Exception {
		Object proxyInstance = Proxy.newProxyInstance(GouShangFactryBean.class.getClassLoader(), new Class[]{mapperInterface}, new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println(method.getName());
				return null;
			}
		});
		return proxyInstance;
	}

	@Override
	public Class<?> getObjectType() {
		return mapperInterface;
	}
}

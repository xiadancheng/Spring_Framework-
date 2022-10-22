package com.zhouyu.mybatis.spring;

import com.zhouyu.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;



public class HanxinFactoryBean implements FactoryBean {//hanxinFatoryBean---->UserMapper代理对象

	private Class mapperInterface;

	private SqlSession sqlSession;

	public void setSqlSession(SqlSessionFactory sessionFactory) {
		sessionFactory.getConfiguration().addMapper(mapperInterface);
		this.sqlSession = sessionFactory.openSession();
	}

	public HanxinFactoryBean(Class mapperInterface) {
		this.mapperInterface = mapperInterface;
	}

	@Override
	public Object getObject() throws Exception {
/*
		//jdk的动态代理
		Object proxyInstance = Proxy.newProxyInstance(HanxinFactoryBean.class.getClassLoader(), new Class[]{mapperInterface}, new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println(method.getName());
				return null;
		});
		return proxyInstance;*/

		return sqlSession.getMapper(mapperInterface);
	}
	@Override
	public Class<?> getObjectType() {

		return mapperInterface;
	}


}

package com.zhouyu.service;

import org.apache.ibatis.session.SqlSession;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.sql.JDBCType;


@Component
public  class UserService{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void test(){
//		UserService o = (UserService) AopContext.currentProxy();//当proxyFactory.setExposeProxy(true);时可以通过这种方式拿到代理对象
		System.out.println("test");
//		throw new NullPointerException();
	}

	public void b(){

	}
}


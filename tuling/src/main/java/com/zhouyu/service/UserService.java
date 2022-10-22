package com.zhouyu.service;

import org.apache.ibatis.session.SqlSession;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;



@Component
public  class UserService {

	@Lazy
	private OrderService orderService;



	public void test(){
		System.out.println("test");
	}

	public void a(){
		System.out.println("a");
//		throw  new NullPointerException();
	}
}


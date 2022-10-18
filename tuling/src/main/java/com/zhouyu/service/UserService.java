package com.zhouyu.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
@Component
@Lazy*/
public  class UserService {
	private OrderService orderService;

/*	public UserService() {
		System.out.println(0);
	}*/

	public UserService(OrderService orderService) {
		System.out.println(1);
		this.orderService = orderService;
	}


	public UserService(OrderService orderService,OrderService orderService1) {
		System.out.println(2);
		this.orderService = orderService;
	}

	public void test(){
		System.out.println(orderService);
	}
}


package com.zhouyu.service;

import com.zhouyu.mapper.MemberMapper;
import com.zhouyu.mapper.OrderMapper;
import com.zhouyu.mapper.UserMapper;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public  class UserService  {

	@Autowired
	private UserMapper userMapper;//
	@Autowired
	private OrderMapper orderMapper;


	public void test(){

		System.out.println(orderMapper.selectById());
		System.out.println(userMapper.selectById());
	}

}


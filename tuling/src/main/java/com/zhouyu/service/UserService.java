package com.zhouyu.service;

import com.zhouyu.mapper.MemberMapper;
import com.zhouyu.mapper.OrderMapper;
import com.zhouyu.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


//@Component
public  class UserService  implements UserServiceInterface {


	public void test(){
		System.out.println("test");
	}

	public void a(){
		System.out.println("a");
//		throw  new NullPointerException();
	}
}


package com.zhouyu.service;

import com.zhouyu.mapper.MemberMapper;
import com.zhouyu.mapper.OrderMapper;
import com.zhouyu.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
public  class UserService  {
/*	@Autowired
	private SqlSession session;*/

	@Autowired
	private UserMapper userMapper;//
	@Autowired
	private OrderMapper orderMapper;//SqlSessionTemplate.getMapper()----->Mybatis代理对象



	@Transactional
	public void test(){//建立数据库连接
//		session.selectOne("com.zhouyu.mapper.UserMapper.selectById");


//DefaultSqlSession.selectOne()----->sqlSessionTemplate.selectOne()------>sqlSessionProxy.selectOne()----->ThreadLocal----->DefaultSqlSession.selectOne()在这里真正的执行sql
		System.out.println(orderMapper.selectById());

		System.out.println(orderMapper.selectById());//sqlSessionTemplate.selectOne()------>sqlSessionProxy.selectOne()----->DefaultSqlSession.selectOne()在这里真正的执行sql

		System.out.println(userMapper.selectById());
	}

}


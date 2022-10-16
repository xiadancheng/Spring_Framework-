package com.zhouyu.service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class CService {

	@Autowired
	private AService aService;



	private void test(){
		System.out.println("123");
	}
}

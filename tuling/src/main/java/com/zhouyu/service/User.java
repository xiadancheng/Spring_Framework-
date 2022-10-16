package com.zhouyu.service;

import com.zhouyu.Hello;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class User {



	@Hello("aaaa")
	private String name;

	private String name2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}

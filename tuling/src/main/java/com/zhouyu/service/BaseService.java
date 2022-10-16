package com.zhouyu.service;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<O,S>{

	@Autowired
	protected O o;

	@Autowired
	protected S s;
}

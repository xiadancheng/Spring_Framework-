package com.zhouyu.advice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class ZhouyuThrowAdvice implements ThrowsAdvice {


	public void afterThrowing(Method method,Object[] args,Object target,NullPointerException ex) {
		System.out.println("方法抛异常之后执行");
	}
	public void afterThrowing(Method method,Object[] args,Exception ex) {
		System.out.println("方法抛异常之后执行");
	}

	public void afterThrowing(NullPointerException e) {
		System.out.println("方法抛异常之后执行");
	}


}

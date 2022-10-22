package com.zhouyu.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class ZhouyuAfterReturningAdvice implements AfterReturningAdvice {
	/**
	 * 方法执行之后调用
	 * @param returnValue the value returned by the method, if any 代理方法的返回值
	 * @param method the method being invoked
	 * @param args the arguments to the method
	 * @param target the target of the method invocation. May be {@code null}.
	 * @throws Throwable
	 */
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("方法执行之后");

	}
}

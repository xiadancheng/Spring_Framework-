package com.zhouyu.advice;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 方法执行之前
 */
//@Component
public class ZhouyuBeforeAdvice implements MethodBeforeAdvice {
	/**
	 *
	 * @param method the method being invoked	当前执行的方法
	 * @param args the arguments to the method	执行方法传入的参数
	 * @param target the target of the method invocation. May be {@code null}. 被代理对象
	 * @throws Throwable
	 */
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("方法执行前执行");
	}
}

package com.zhouyu.advice;

import org.springframework.aop.MethodMatcher;

import java.lang.reflect.Method;

public class GousangMethodMatcher implements MethodMatcher {
	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		return method.getName().equals("test");
	}

	@Override
	public boolean isRuntime() {
		return false;
	}

	@Override
	public boolean matches(Method method, Class<?> targetClass, Object... args) {
		return false;
	}
}

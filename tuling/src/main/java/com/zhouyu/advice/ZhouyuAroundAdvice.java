package com.zhouyu.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ZhouyuAroundAdvice implements MethodInterceptor {
	@Nullable
	@Override
	public Object invoke(@NotNull MethodInvocation invocation) throws Throwable {
		System.out.println("方法执行前");
		Object proceed = invocation.proceed();//手动调用被代理的方法
		System.out.println("方法执行后");
		return proceed;

	}
}

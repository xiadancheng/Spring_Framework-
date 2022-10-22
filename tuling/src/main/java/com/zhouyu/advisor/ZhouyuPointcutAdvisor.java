package com.zhouyu.advisor;

import com.zhouyu.advice.ZhouyuBeforeAdvice;
import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

public class ZhouyuPointcutAdvisor implements PointcutAdvisor {
	@Override
	public Advice getAdvice() {
		return new ZhouyuBeforeAdvice();
	}

	@Override
	public boolean isPerInstance() {
		return false;
	}

	@Override
	public Pointcut getPointcut() {
		return new StaticMethodMatcherPointcut() {
			@Override
			public boolean matches(Method method, Class<?> targetClass) {
				return method.getName().equals("test");
			}
		};
	}
}

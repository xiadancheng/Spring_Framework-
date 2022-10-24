package com.zhouyu.advisor;

import com.zhouyu.advice.ZhouyuAroundAdvice;
import com.zhouyu.advice.ZhouyuBeforeAdvice;
import com.zhouyu.service.UserService;
import org.aopalliance.aop.Advice;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class ZhouyuPointcutAdvisor implements PointcutAdvisor {

//	代理逻辑
	@Override
	public Advice getAdvice() {
		return new ZhouyuAroundAdvice();
	}

	@Override
	public boolean isPerInstance() {
		return false;
	}

	/**
	 * 筛选逻辑，
	 * @return
	 */
	@Override
	public Pointcut getPointcut() {
		return new Pointcut() {
			@Override
			public ClassFilter getClassFilter() {
				return new ClassFilter() {
					@Override
					public boolean matches(Class<?> clazz) {
//						代理类是否符合
						/*pointcutAdvisor.getPointcut().getClassFilter().matches(actualClass)*/
						return clazz.equals(UserService.class);
					}
				};
			}

			@Override
			public MethodMatcher getMethodMatcher() {
				return new MethodMatcher() {
					@Override
					public boolean matches(Method method, Class<?> targetClass) {
						/* pointcutAdvisor.getPointcut().getMethodMatcher();*/

						return method.getName().equals("test");
					}

//
					@Override
					public boolean isRuntime() {
						/**
						 * true :interceptorList.add(new InterceptorAndDynamicMethodMatcher(interceptor, mm));  这样的话还会判断下面的条件，相当于判断入参是否匹配
						 * false:interceptorList.addAll(Arrays.asList(interceptors));
						 */
						return true;
					}


					/*dm.methodMatcher.matches(this.method, targetClass, this.arguments）*/
					@Override
					public boolean matches(Method method, Class<?> targetClass, Object... args) {
						return false;
					}
				};
			}
		};
	}
}

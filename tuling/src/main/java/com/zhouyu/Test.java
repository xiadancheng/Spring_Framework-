package com.zhouyu;

import com.zhouyu.advice.ZhouyuAfterReturningAdvice;
import com.zhouyu.advice.ZhouyuAroundAdvice;
import com.zhouyu.advice.ZhouyuBeforeAdvice;
import com.zhouyu.advice.ZhouyuThrowAdvice;
import com.zhouyu.mapper.OrderMapper;
import com.zhouyu.mapper.UserMapper;
import com.zhouyu.mybatis.spring.HanxinFactoryBean;

import com.zhouyu.service.OrderService;
import com.zhouyu.service.PerSon;
import com.zhouyu.service.UserService;
import com.zhouyu.service.UserServiceInterface;
import org.aopalliance.aop.Advice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.cglib.proxy.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.lang.reflect.Method;


public class Test {

	public static void main(String[] args) throws IOException {

	/*	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);

		context.refresh();


		UserService userService = (UserService) context.getBean("userService");
		userService.test();

		//ProxyFactory*/

		UserService target = new UserService();

/*
// 通过cglib技术
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(UserService.class);

// 定义额外逻辑，也就是代理逻辑
		enhancer.setCallbacks(new Callback[]{new MethodInterceptor() {
			@Override
			public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
				System.out.println("before...");
//				执行被代理的方法，目标对象
				Object result = methodProxy.invoke(target, objects);
//				Object invoke = method.invoke(target, objects);
//				Object result2 = methodProxy.invokeSuper(o, objects);//userServiceProxy-------父类------>target

				System.out.println("after...");
				return result;
			}
		}, NoOp.INSTANCE});

		enhancer.setCallbackFilter(new CallbackFilter() {
			@Override
			public int accept(Method method) {
				if (method.getName().equals("test")){
					return 0;
				}else {
					return 1;
				}

			}
		});
		UserService userService=(UserService) enhancer.create();

		userService.test();
		userService.a();
*/

//		JDK的动态代理
/*		UserServiceInterface proxyInstance = (UserServiceInterface) Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[]{UserServiceInterface.class}, new InvocationHandler() {
			@Override
			public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
				System.out.println("before");
				Object invoke = method.invoke(target, objects);

				return null;
			}
		});

		proxyInstance.test();
		proxyInstance.a();*/



//		整合cjlib和JDK动态代理
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(target);//设置被代理对象
//		控制代理方法
		proxyFactory.addAdvisor(new PointcutAdvisor() {
			@Override
			public Pointcut getPointcut() {
				return new StaticMethodMatcherPointcut() {
					@Override
					public boolean matches(Method method, Class<?> targetClass) {
						return method.getName().equals("test");
					}
				};
			}

			@Override
			public Advice getAdvice() {
				return new ZhouyuBeforeAdvice();
			}

			@Override
			public boolean isPerInstance() {
				return false;
			}
		});
		UserService proxy = (UserService) proxyFactory.getProxy();//得到代理对象
		proxy.a();
//		proxy.test();
	}





	}









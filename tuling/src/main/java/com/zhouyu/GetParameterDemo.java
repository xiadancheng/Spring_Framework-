package com.zhouyu;

import com.zhouyu.service.OrderService;
import org.springframework.core.annotation.Order;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * 获取方法中参数的demo
 */
public class GetParameterDemo{

	public void a(String abc, OrderService orderService){

	}

	public static void main(String[] args) throws NoSuchMethodException {
		Method method = GetParameterDemo.class.getMethod("a",new Class[]{String.class,OrderService.class});
/*
	需要在maven中配置这个参数
	<compilerAres>
		<arg>-parmeters</arg>
	</compilerAres>
	*/
//		获取方法中参数的类型
		for (Class<?> parameterType : method.getParameterTypes()) {
			System.out.println(parameterType);
		}
//		获取方法参数的名称
		for (Parameter parameter : method.getParameters()) {

			System.out.println(parameter.getName());
		}
	}
}

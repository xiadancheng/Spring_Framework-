package com.zhouyu.aspect;

import com.zhouyu.service.UserImplement;
import com.zhouyu.service.UserServiceInterface;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ZhouyuAspect {


/*	@Before("execution(public void com.zhouyu.service.UserService.test())")
	public void zhouyuBefore(JoinPoint joinPoint){
		System.out.println("zhouyubefore");

	}*/



	/**
	 * 给UserService.class增加一个UserServiceInterface接口
	 * defaultImpl = UserImplement.class 需要写一个实现类实现这个接口里面的方法
	 */
/*	@DeclareParents(value = "com.zhouyu.service.UserService",defaultImpl = UserImplement.class)
	private UserServiceInterface userServiceInterface;*/


/*拿到切面的参数
@Before(value = "execution(public void com.zhouyu.service.UserService.test(..))&&args(a,b)",argNames = "a,b")
	public void zhouyuBefore(String a,String b){
		System.out.println(a);
		System.out.println(b);
		System.out.println("zhouyuBefore");
	}

	@Pointcut("execution(public void com.zhouyu.service.UserService.b())")
	public void b(){

	}

	@Before("b()")
	public void a(){

	}*/

	@Before("execution(public void com.zhouyu.service.UserService.test())")
	public void UserServiceAspectByTest(){
		System.out.println("test");
	}
}

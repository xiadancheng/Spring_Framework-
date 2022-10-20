package com.zhouyu;


import com.zhouyu.service.AppInterface;
import com.zhouyu.service.OrderService;
import com.zhouyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


//@Import({OrderService.class})
//@Configuration(proxyBeanMethods = false)//true:full配置类   false:lite配置类
//@PropertySource("spring.properties")//导入spring.properties内容
//@Component
//@ComponentScan("com.zhouyu.service")
/*@ImportResource("spring.xml")*/
//@Configuration(proxyBeanMethods = true)
public class AppConfig1 implements AppInterface {


/*	@Bean(autowire = Autowire.BY_TYPE)
	public UserService userService(){
		System.out.println(orderService());
		return new UserService();
	}

	@Bean
	public OrderService orderService(){
		return new OrderService();
	}*/

}


package com.zhouyu;


import com.zhouyu.service.AppInterface;
import com.zhouyu.service.HanxinImport;
import com.zhouyu.service.OrderService;
import com.zhouyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;


//@Import({HanxinImport.class})
//true:full配置类     beanDefinition.ClassName---->代理类----->代理对象
// false:lite配置类
//@Configuration(proxyBeanMethods = true)
//@PropertySource("spring.properties")//导入spring.properties内容
//@Component
//@ComponentScan("com.zhouyu.service")
//@ImportResource("spring.xml")
//@ComponentScan("com.zhouyu.service")
@Configuration(proxyBeanMethods = true)
public class AppConfig{



	@Bean
	public UserService userService(){
		System.out.println(orderService());
		System.out.println(orderService());
		return new UserService();
	}

	@Bean
	public OrderService orderService(){//创建orderService
		return new OrderService();
	}


}


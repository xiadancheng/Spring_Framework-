package com.zhouyu;


import com.zhouyu.service.OrderService;
import com.zhouyu.service.UserService;
import com.zhouyu.servicescan.AppInterface;
import com.zhouyu.servicescan.HanxinImport;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Import(OrderService.class)
public class AppConfig {


	/*ated-histories
fatal: couldn't find remote ref master
*/
/*
	@Bean(autowire = Autowire.BY_TYPE)
	public UserService userService(){
		return new UserService();
	}

*/


//	不是static的方法
//	生成BeanDefinition其中参数值的情况:
//	factoryBeanName:appconfig
//	factoryMethodName：userService
//	factoryClass:Appconfig.class
//	isFctoryMethodUnique:true(是不是唯一的)

/*	@Bean
	public  UserService userService(){
		return new UserService();
	}

	@Bean
	public  UserService userService(OrderService orderService){
		return new UserService();
	}*/
/*

	@Bean
	public UserService userService(OrderService orderService){
		return new UserService();
	}
*/

/*	@Bean(autowireCandidate = true)//可不可以用来依赖注入
	public OrderService orderService(){
		return new OrderService();
	}*/

/*
	@Bean(autowireCandidate = true)

	public OrderService orderService1(){
		return new OrderService();
	}
*/





/*
	@Bean(autowire = Autowire.BY_TYPE)
	public UserService userService(){
		return new UserService();
	}

*/

/*	@Bean
	public UserService userService1(){
		return new UserService();
	}*/


/*	@Bean
	public UserService userService1(){
		return new UserService();
	}*/

/*
	@Bean(autowire = Autowire.BY_NAME)
	public UserService userService(){
		return new UserService();
	}*/

/*
	@Bean
	private String name(){
		return "aaaa";
	}*/


	/**
	 * 定义一个国际化资源
	 * @return
	 */
/*
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}
*/


/*	*//**
	 * 定义事件监听器
	 * @return
	 *//*
	@Bean
	public ApplicationListener applicationListener() {
		return new ApplicationListener() {
			@Override
			public void onApplicationEvent(ApplicationEvent event) {
				System.out.println("接收到了一个事件"+event.getSource());
			}
		};
	}*/


/*
	@Bean
	public CustomEditorConfigurer customEditorConfigurer() {
//		自定义类型转化器规则
		CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
		Map<Class<?>, Class<? extends PropertyEditor>> propertyEditorMap = new HashMap<>();
		// 表示StringToUserPropertyEditor可以将String转化成User类型，
		// 在Spring源码中，如果发现当前对象是String，而需要的类型是User，就会使用该PropertyEditor来做类型转化
		propertyEditorMap.put(User.class, StringToUserPropertyEditor.class);
		customEditorConfigurer.setCustomEditors(propertyEditorMap);
		return customEditorConfigurer;
	}
*/



/*	@Bean
	public ConversionServiceFactoryBean conversionService() {
		ConversionServiceFactoryBean conversionServiceFactoryBean = new ConversionServiceFactoryBean();
		conversionServiceFactoryBean.setConverters(Collections.singleton(new StringToUserConverter()));
		return conversionServiceFactoryBean;
	}*/


/*	@Bean
	public ConversionServiceFactoryBean conversionService() {
		ConversionServiceFactoryBean conversionServiceFactoryBean = new ConversionServiceFactoryBean();
		conversionServiceFactoryBean.setConverters(Collections.singleton(new StringToOrderServiceConverter()));
		return conversionServiceFactoryBean;
	}*/


}


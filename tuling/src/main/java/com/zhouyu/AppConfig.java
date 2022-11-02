package com.zhouyu;


import com.zhouyu.editor.StringToUserPropertyEditor;
import com.zhouyu.service.User;
import com.zhouyu.service.UserService;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.beans.PropertyEditor;
import java.util.HashMap;
import java.util.Map;


//@Import({HanxinImport.class})
//true:full配置类     beanDefinition.ClassName---->代理类----->代理对象
// false:lite配置类
//@Configuration(proxyBeanMethods = true)
//@PropertySource("spring.properties")//导入spring.properties内容
//@Component
//@ComponentScan("com.zhouyu")
//@ImportResource("spring.xml")
//@ComponentScan("com.zhouyu.service")
//@Configuration(proxyBeanMethods = true)
//@HanxinMapperScan("com.zhouyu.mapper")
//@GouMapperScan("com.zhouyu.mapper")
//@MapperScan("com.zhouyu.mapper")
//@EnableTransactionManagement
//@Import(AnnotationAwareAspectJAutoProxyCreator.class)//只会找advie类型的bean
//@EnableAspectJAutoProxy()
@Configuration
@ComponentScan(value = "com.zhouyu",
		excludeFilters = {@ComponentScan.Filter(
				type = FilterType.ASSIGNABLE_TYPE,
				classes = UserService.class)})
//@EnableTransactionManagement
public class AppConfig{


/*	@Bean
	public UserService userService(){
		return new UserService();
	}*/

/*
//	国际化
	@Bean
	public MessageSource messageSource(){
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("message");//将国际化资源文件设置在messageSource中
		return messageSource;
	}

	@Bean
	public CustomEditorConfigurer customEditorConfigurer() {
		CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
		Map<Class<?>, Class<? extends PropertyEditor>> propertyEditorMap = new HashMap<>();

		// 表示StringToUserPropertyEditor可以将String转化成User类型，在Spring源码中，如果发现当前对象是String，而需要的类型是User，就会使用该PropertyEditor来做类型转化
		propertyEditorMap.put(User.class, StringToUserPropertyEditor.class);
		customEditorConfigurer.setCustomEditors(propertyEditorMap);
		return customEditorConfigurer;
	}
*/

/*	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer(){
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setBasePackage("com.zhouyu.mapper");
		return mapperScannerConfigurer;
	}*/

	/*@Bean
	public ProxyFactoryBean userService(){
		UserService userService = new UserService();
		ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
//		proxyFactoryBean.addAdvice(new ZhouyuBeforeAdvice());
		proxyFactoryBean.addAdvisor(new ZhouyuPointcutAdvisor());
		proxyFactoryBean.setTarget(userService);

		return proxyFactoryBean;
	}*/

	/**
	 * Bean名称自动代理创建者
	 * @return
	 */
/*	@Bean
	public BeanNameAutoProxyCreator beanNameAutoProxyCreator(){
		BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
		beanNameAutoProxyCreator.setBeanNames("userSe*");//那些bean的名字符合这个表达式
		beanNameAutoProxyCreator.setInterceptorNames("zhouyuAroundAdvice");//这些bean的代理逻辑
		beanNameAutoProxyCreator.setProxyTargetClass(true);
		return beanNameAutoProxyCreator;
	}*/

/*	@Bean
	public DefaultPointcutAdvisor defaultPointcutAdvisor(){
		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
		pointcut.addMethodName("test");//代表某一个bean里面有test方法，那么就会进行动态代理

		DefaultPointcutAdvisor defaultPointcutAdvisor = new DefaultPointcutAdvisor();
		defaultPointcutAdvisor.setPointcut(pointcut);
		defaultPointcutAdvisor.setAdvice(new ZhouyuBeforeAdvice());
		return 	defaultPointcutAdvisor;
	}*/

	/**
	 * 针对正在创建的bean，初始化后的方法里面找spring容器里面有哪些时Advisor的所有bean，拿出pointcut.addMethodName("test");与当前正在创建的bean里面的方法是否匹配
	 * 如果有代表正在创建这个bean需要动态代理
	 * @return
	 */
/*
	@Bean
	public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
		DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
		return defaultAdvisorAutoProxyCreator;
	}
*/


/*
	@Bean
	public SqlSessionFactory sessionFactory() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}
*/


/*	@Bean
	public SqlSession session() throws IOException {
		SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sessionFactory());
		sqlSessionTemplate.getConfiguration().addMapper(UserMapper.class);
		sqlSessionTemplate.getConfiguration().addMapper(OrderMapper.class);
		sqlSessionTemplate.getConfiguration().addMapper(MemberMapper.class);
		return sqlSessionTemplate;
	}*/

	/*
	拿到事务管理器
	final TransactionManager tm = determineTransactionManager(txAttr);
	* */

/*	@Bean
	public BoFactoryBean boFactoryBean(){
		return new BoFactoryBean();
	}*/
/*


	@Bean
	public PlatformTransactionManager transactionManager(){
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource());
//		transactionManager.setGlobalRollbackOnParticipationFailure(false);//true:部分失败，全局回滚，false:部分失败，全局不会滚
		return transactionManager;
	}
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/tuling?characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai");
		dataSource.setUsername("root");
		dataSource.setPassword("925925");
		return  dataSource;
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource());
		return sqlSessionFactoryBean.getObject();
	}

	@Bean
	public JdbcTemplate jdbcTemplate(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;
	}

*/


}


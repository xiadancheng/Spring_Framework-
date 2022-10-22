package com.zhouyu;


import com.zhouyu.advice.ZhouyuBeforeAdvice;
import com.zhouyu.advisor.ZhouyuPointcutAdvisor;
import com.zhouyu.service.UserService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;


import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import javax.sql.DataSource;


//@Import({HanxinImport.class})
//true:full配置类     beanDefinition.ClassName---->代理类----->代理对象
// false:lite配置类
//@Configuration(proxyBeanMethods = true)
//@PropertySource("spring.properties")//导入spring.properties内容
//@Component
@ComponentScan("com.zhouyu")
//@ImportResource("spring.xml")
//@ComponentScan("com.zhouyu.service")
//@Configuration(proxyBeanMethods = true)
//@HanxinMapperScan("com.zhouyu.mapper")
//@GouMapperScan("com.zhouyu.mapper")
//@MapperScan("com.zhouyu.mapper")
//@EnableTransactionManagement
@Import(AnnotationAwareAspectJAutoProxyCreator.class)//只会找advie类型的bean
/*@EnableAspectJAutoProxy*/
public class AppConfig{
	/*@Bean
	public MapperScannerConfigurer mapperScannerConfigurer(){
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setBasePackage("com.zhouyu.mapper");
		return mapperScannerConfigurer;
	}*/

/*	@Bean
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
	@Bean
	public BeanNameAutoProxyCreator beanNameAutoProxyCreator(){
		BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
		beanNameAutoProxyCreator.setBeanNames("userSe*");//那些bean的名字符合这个表达式
		beanNameAutoProxyCreator.setInterceptorNames("zhouyuAroundAdvice");//这些bean的代理逻辑
		beanNameAutoProxyCreator.setProxyTargetClass(true);
		return beanNameAutoProxyCreator;
	}

	@Bean
	public DefaultPointcutAdvisor defaultPointcutAdvisor(){
		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
		pointcut.addMethodName("test");//代表某一个bean里面有test方法，那么就会进行动态代理

		DefaultPointcutAdvisor defaultPointcutAdvisor = new DefaultPointcutAdvisor();
		defaultPointcutAdvisor.setPointcut(pointcut);
		defaultPointcutAdvisor.setAdvice(new ZhouyuBeforeAdvice());
		return 	defaultPointcutAdvisor;
	}

	/**
	 * 针对正在创建的bean，初始化后的方法里面找spring容器里面有哪些时Advisor的所有bean，拿出pointcut.addMethodName("test");与当前正在创建的bean里面的方法是否匹配
	 * 如果有代表正在创建这个bean需要动态代理
	 * @return
	 */
	@Bean
	public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
		DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
		return defaultAdvisorAutoProxyCreator;
	}


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


	@Bean
	public PlatformTransactionManager transactionManager(){
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource());
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



}


package com.zhouyu;


import com.mysql.cj.xdevapi.SessionFactory;
import com.zhouyu.mapper.MemberMapper;
import com.zhouyu.mapper.OrderMapper;
import com.zhouyu.mapper.UserMapper;
import com.zhouyu.mybatis.spring.HanxinMapperScan;
import com.zhouyu.mybatis.spring.ZhouyuImportBeanDefinitionRegister;
import com.zhouyu.service.AppInterface;
import com.zhouyu.service.HanxinImport;
import com.zhouyu.service.OrderService;
import com.zhouyu.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.*;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;


import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.event.TransactionalEventListener;


import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;


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
@EnableTransactionManagement
public class AppConfig{
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer(){
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setBasePackage("com.zhouyu.mapper");
		return mapperScannerConfigurer;
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


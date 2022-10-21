package com.zhouyu;


import com.mysql.cj.xdevapi.SessionFactory;
import com.zhouyu.mybatis.spring.HanxinMapperScan;
import com.zhouyu.mybatis.spring.ZhouyuImportBeanDefinitionRegister;
import com.zhouyu.mybatis.spring1.GouMapperScan;
import com.zhouyu.mybatis.spring1.GouShangImportBeanDefinitionRegister;
import com.zhouyu.service.AppInterface;
import com.zhouyu.service.HanxinImport;
import com.zhouyu.service.OrderService;
import com.zhouyu.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.*;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

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

@GouMapperScan("com.zhouyu.mapper")
public class AppConfig{
/*
	@Bean
	public SqlSessionFactory sessionFactory() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}*/







}


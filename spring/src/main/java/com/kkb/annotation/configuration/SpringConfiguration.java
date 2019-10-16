package com.kkb.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.kkb.project.po.User;

//相当于编写了一个spring配置文件
@Configuration
@ComponentScan(basePackages="com.kkb.project")
@Import(DaoConfiguration.class)
public class SpringConfiguration {

	// spring容器初始化时，会调用配置类的无参构造函数
	public SpringConfiguration() {
		System.out.println("容器启动初始化。。");
	}
	
	@Bean("user")
	public User getUser() {
		return new User();
	}
	
}

package com.kkb.annotation.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kkb.annotation.configuration.SpringConfiguration;
import com.kkb.project.po.User;
import com.kkb.project.service.UserService;

//@RunWith是Junit对外提供的注解，作用是表示这个单元测试类交给哪个类进行运行
@RunWith(SpringJUnit4ClassRunner.class)
//locations:用于指定spring配置文件的路径
//@ContextConfiguration(locations="classpath:project/spring-xml.xml")
//classes：用于指定纯注解方式下的@Configuration标记的类
@ContextConfiguration(classes=SpringConfiguration.class)
public class TestSpringAnnotation2 {

	@Resource
	private UserService service;
	
	@Test
	public void test() {
		User user = service.findUserById(1);
		System.out.println(user);
	}

}

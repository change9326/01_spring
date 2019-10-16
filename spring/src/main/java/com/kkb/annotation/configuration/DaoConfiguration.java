package com.kkb.annotation.configuration;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

//相当于编写了一个spring配置文件
//如果该类被其他配置类import了，该类上面可以不写configuration注解
//@Configuration
@PropertySource("classpath:db.properties")
public class DaoConfiguration {

	@Value("${db.driver}")
	private String driverClassName;
	
	@Value("${db.url}")
	private String url;
	
 	@Value("${db.username}")
 	private String username;
 	
	@Value("${db.password}")
	private String password;
	
	@Bean("dataSource")
	public DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getDataSource());
		
		return template;
		
	}
}

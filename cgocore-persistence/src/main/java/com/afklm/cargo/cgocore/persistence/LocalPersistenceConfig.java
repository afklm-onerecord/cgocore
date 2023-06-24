package com.afklm.cargo.cgocore.persistence;

import java.util.Properties;

import javax.inject.Inject;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@Profile("local")
public class LocalPersistenceConfig {
	
	@Inject
	private Environment env;

	@Bean
    public DataSource dataSource() {
		BasicDataSource result = new BasicDataSource();
		result.setDriverClassName(env.getRequiredProperty("db.driverClassName"));
		result.setUrl(env.getRequiredProperty("db.url"));
		result.setUsername(env.getRequiredProperty("db.userName"));
		result.setPassword(env.getRequiredProperty("db.password"));
		return result;
     }
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() throws NamingException {
		LocalSessionFactoryBean result = new LocalSessionFactoryBean();
		
		result.setPackagesToScan("com.afklm.cargo.cgocore");
		result.setDataSource(dataSource());
		
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.show_sql", env.getRequiredProperty("hibernate.showSql"));
		hibernateProperties.setProperty("hibernate.dialect", env.getRequiredProperty("hibernate.dialect"));
		result.setHibernateProperties(hibernateProperties);
		
		return result;
	}
}
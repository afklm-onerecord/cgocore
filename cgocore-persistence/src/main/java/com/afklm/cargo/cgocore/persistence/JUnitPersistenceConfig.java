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
@Profile("junit")
public class JUnitPersistenceConfig {
	
	@Inject
	private Environment env;

	@Bean
    public DataSource dataSource() {
        BasicDataSource result = new BasicDataSource();
        result.setDriverClassName("org.hsqldb.jdbcDriver");
        result.setUrl("jdbc:hsqldb:mem:cgocore");
        result.setUsername("sa");
        result.setPassword("");
        return result;
    }
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() throws NamingException {
		LocalSessionFactoryBean result = new LocalSessionFactoryBean();
		
		result.setPackagesToScan("com.afklm.cargo.cgocore");
		result.setDataSource(dataSource());
		
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.show_sql", env.getProperty("hibernate.showSql"));
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
		result.setHibernateProperties(hibernateProperties);
		
		return result;
	}
}
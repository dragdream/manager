package com.cc.manager.config;

import java.beans.PropertyVetoException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 
 * @ClassName: DBconfig
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author: chumengcheng
 * @date: 2020年5月29日 下午4:00:23
 */
@Configuration
public class DBconfig {
	@Autowired
	private Environment env;

	@Bean(name = "dataSource")
	public ComboPooledDataSource dataSource() throws PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass(env.getProperty("ms.db.driverClassName"));
		dataSource.setJdbcUrl(env.getProperty("ms.db.url"));
		dataSource.setUser(env.getProperty("ms.db.username"));
		dataSource.setPassword(env.getProperty("ms.db.password"));
		dataSource.setMaxPoolSize(20);
		dataSource.setMinPoolSize(5);
		dataSource.setInitialPoolSize(10);
		dataSource.setMaxIdleTime(300);
		dataSource.setAcquireIncrement(5);
		dataSource.setIdleConnectionTestPeriod(60);
		return dataSource;
	}
}

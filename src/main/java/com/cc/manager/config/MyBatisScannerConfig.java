package com.cc.manager.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @ClassName:     MyBatisScannerConfig   
 * @Description:   TODO(这里用一句话描述这个类的作用)   
 * @author:        chumengcheng
 * @date:          2020年5月29日 下午4:02:01
 */
@Configuration
public class MyBatisScannerConfig {
	@Bean
	public MapperScannerConfigurer MapperScannerConfigurer() {
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setBasePackage("com.cc.manager.dao");
		mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
		return mapperScannerConfigurer;
	}
}

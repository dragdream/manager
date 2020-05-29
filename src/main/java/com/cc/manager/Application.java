package com.cc.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @ClassName:     Application   
 * @Description:   TODO(这里用一句话描述这个类的作用)   
 * @author:        chumengcheng
 * @date:          2020年5月29日 下午3:58:27
 */
@ComponentScan(basePackages ="com.cc.manager")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
    	SpringApplication.run(Application.class, args);
        // ConfigurableApplicationContext run = run(Application.class, args);
    }

}

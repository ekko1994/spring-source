package com.ekko.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zzhh
 * @create 2022-07-19 15:28
 */
// @Import(value = {/*MyImportRegistrar.class,*/ Person.class})
@Configuration
@ComponentScan(value = {"com.ekko.spring"})
public class MyConfig {

	public MyConfig() {
		System.out.println("MyConfig...创建了...");
	}

	// // @Bean
	// public Person person(){
	// 	return new Person();
	// }
	//
	// @Bean
	// public Cat cat(){
	// 	return new Cat("小黑");
	// }

}

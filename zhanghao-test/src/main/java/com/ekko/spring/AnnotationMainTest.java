package com.ekko.spring;

import com.ekko.spring.aop.HelloService;
import com.ekko.spring.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zzhh
 * @create 2022-07-19 18:10
 */
public class AnnotationMainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

		// Cat bean = applicationContext.getBean(Cat.class);
		// System.out.println(bean);
		System.out.println();
		HelloService service = applicationContext.getBean(HelloService.class);
		service.sayHello("Jack");
	}
}

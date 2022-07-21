package com.ekko.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author zzhh
 * @create 2022-07-19 15:29
 */
// @Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class Cat implements InitializingBean {

	private String name;

	public Cat() {
		System.out.println("Cat被创建了...");
	}

	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Value("${JAVA_HOME}")
	public void setName(String name) {
		System.out.println("Cat...setName()正在赋值...");
		this.name = name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Cat...afterPropertiesSet()执行...");
	}
}

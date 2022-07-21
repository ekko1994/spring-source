package com.ekko.spring.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author zzhh
 * @create 2022-07-19 22:29
 */
@Component
public class HelloFactory implements FactoryBean<Dog> {

	@Override
	public Dog getObject() throws Exception {
		return new Dog();
	}

	@Override
	public Class<Dog> getObjectType() {
		return Dog.class;
	}
}

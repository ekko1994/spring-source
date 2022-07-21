package com.ekko.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zzhh
 * @create 2022-05-24 12:36
 */
public class MainTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans2.xml");
		for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
			System.out.println(beanDefinitionName);
		}
	}

	private static void test1() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
			System.out.println(beanDefinitionName);
		}

		// Cat cat1 = applicationContext.getBean(Cat.class);
		// Cat cat2 = applicationContext.getBean(Cat.class);
		//
		// System.out.println("cat1 == cat2 ? " + (cat1 == cat2));

		// Person person1 = applicationContext.getBean(Person.class);
		// Cat cat1 = person1.getCat();
		//
		// Person person2 = applicationContext.getBean(Person.class);
		// Cat cat2 = person2.getCat();
		// System.out.println("cat1 == cat2 ? " + (cat1 == cat2));
		//
		// System.out.println(cat1);
		// Person bean = applicationContext.getBean(Person.class);
		// System.out.println(bean);
		// Cat cat = applicationContext.getBean(Cat.class);
		// System.out.println(cat);
	}
}

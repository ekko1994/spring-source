package com.ekko.spring.config;

import com.ekko.spring.bean.Cat;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zzhh
 * @create 2022-07-19 15:48
 */
public class MyImportRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		RootBeanDefinition definition = new RootBeanDefinition();
		definition.setBeanClass(Cat.class);
		registry.registerBeanDefinition("myCat",definition);
	}
}

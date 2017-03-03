package com.xywei.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xywei.config.JavaBeanConfig;
import com.xywei.service.FunctionService;
import com.xywei.service.UseFunctionService;

public class TestConfig {

	@Test
	public void test1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaBeanConfig.class);
		UseFunctionService service = context.getBean(UseFunctionService.class);
		System.out.println(service.sayHello("喔喔"));
		context.close();
	}

	@Test
	public void test2() {
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(
				JavaBeanConfig.class);
		FunctionService service = configApplicationContext.getBean(FunctionService.class);
		System.out.println(service.sayHello2("海峡"));
		configApplicationContext.close();
	}

}

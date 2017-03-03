package com.xywei.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xywei.config.JavaBeanConfig2;
import com.xywei.service.FunctionService2;
import com.xywei.service.UseFunctionService2;

public class TestConfig2 {

	@Test
	public void test1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaBeanConfig2.class);
		UseFunctionService2 service = context.getBean(UseFunctionService2.class);
		System.out.println(service.sayHello("喔喔"));
		context.close();
	}

	@Test
	public void test2() {
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(
				JavaBeanConfig2.class);
		FunctionService2 service = configApplicationContext.getBean(FunctionService2.class);
		System.out.println(service.sayHello("海峡"));
		configApplicationContext.close();
	}

}

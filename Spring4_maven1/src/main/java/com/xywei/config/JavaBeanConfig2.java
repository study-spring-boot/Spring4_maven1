package com.xywei.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xywei.service.UseFunctionService2;

@Configuration
public class JavaBeanConfig2 {

	@Bean
	public UseFunctionService2 useFunctionService2() {
		return new UseFunctionService2();
	}

}

package com.xywei.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xywei.dao.FunctionDao2;
import com.xywei.service.FunctionService2;
import com.xywei.service.UseFunctionService2;

/**
 * 不使用扫描来处理
 * 
 * @author wodoo
 *
 */
@Configuration
public class JavaBeanConfig2 {

	public FunctionDao2 functionDao2() {
		return new FunctionDao2();
	}

	@Bean
	public FunctionService2 functionService2() {
		FunctionService2 functionService2 = new FunctionService2();
		functionService2.setFunctionDao2(functionDao2());
		return functionService2;
	}

	@Bean
	public UseFunctionService2 useFunctionService2() {
		UseFunctionService2 useFunctionService2 = new UseFunctionService2();
		useFunctionService2.setFunctionService2(functionService2());
		return useFunctionService2;
	}

	@Bean
	public UseFunctionService2 useFunctionService2(FunctionService2 functionService2) {
		UseFunctionService2 useFunctionService2 = new UseFunctionService2();
		useFunctionService2.setFunctionService2(functionService2);
		return useFunctionService2;
	}
}

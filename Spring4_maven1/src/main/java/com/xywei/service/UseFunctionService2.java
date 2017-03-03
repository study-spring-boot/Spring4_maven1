package com.xywei.service;

public class UseFunctionService2 {

	private FunctionService functionService;

	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}

	public String sayHello(String word) {
		return functionService.sayHello(word);

	}

	public String sayHello2(String word) {
		return functionService.sayHello2(word);
	}
}

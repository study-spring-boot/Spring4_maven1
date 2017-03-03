package com.xywei.service;

public class UseFunctionService2 {

	private FunctionService2 functionService2;

	public void setFunctionService2(FunctionService2 functionService2) {
		this.functionService2 = functionService2;
	}

	public String sayHello(String word) {
		return functionService2.sayHello(word);

	}

	public String sayHello2(String word) {
		return functionService2.sayHello(word);
	}
}

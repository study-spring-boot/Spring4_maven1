package com.xywei.service;

import com.xywei.dao.FunctionDao2;

public class FunctionService2 {

	private FunctionDao2 functionDao2;

	public void setFunctionDao2(FunctionDao2 functionDao2) {
		this.functionDao2 = functionDao2;
	}

	public String sayHelloByDao(String word) {
		return functionDao2.sayHello2(word);
	}

	public String sayHello(String word) {
		return "Hello" + word;

	}

}

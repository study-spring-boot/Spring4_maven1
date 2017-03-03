package com.xywei.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {

	@Autowired
	FunctionService functionService;

	public String sayHello(String word) {
		return functionService.sayHello(word);

	}

	public String sayHello2(String word) {
		return functionService.sayHello2(word);
	}
}

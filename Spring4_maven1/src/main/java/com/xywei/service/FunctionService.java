package com.xywei.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xywei.dao.FunctionDao;

@Service
public class FunctionService {

	@Autowired
	private FunctionDao functionDao;

	public String sayHello(String word) {
		return "Hello" + word;

	}

	public String sayHello2(String word) {
		return functionDao.sayHello2(word);
	}

}

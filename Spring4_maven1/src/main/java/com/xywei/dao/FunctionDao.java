package com.xywei.dao;

import org.springframework.stereotype.Controller;

//@Repository
//@Service 随便一个都可以
@Controller
public class FunctionDao {
	public String sayHello2(String word) {
		return "dao, Hello " + word;
	}
}

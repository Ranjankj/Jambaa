package com.aopDemo.aopDemo.data;

import org.springframework.stereotype.Component;

@Component
public class Dao1 {
	
	public String retreiveData() {
		return "Inside Dao1";
	}
}

package com.kkdz.core.service;

import org.springframework.stereotype.Service;

@Service("myCustomService")
public class CustomServiceImpl implements CustomService{

	public String getName() {
		System.out.println("我是提供者");
		return "provider";
	}


}

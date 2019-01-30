package com.kkdz.core.service;


public class CustomServiceImpl implements CustomService{

	public String getName() {
		System.out.println("我是提供者");
		return "provider";
	}


}

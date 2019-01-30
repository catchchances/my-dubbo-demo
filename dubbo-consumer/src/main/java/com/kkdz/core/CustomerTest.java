package com.kkdz.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kkdz.core.service.CustomService;

public class CustomerTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "dubbo-config.xml" });
		
		context.start();

		CustomService demoService = (CustomService) context.getBean("myCustomService"); // 获取远程服务代理
		String hello = demoService.getName(); // 执行远程方法

		System.out.println(hello); // 显示调用结果

		context.close();
	}
}
package com.kkdz.core.controller;

import javax.annotation.PostConstruct;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kkdz.core.service.CustomService;

@Controller
public class IndexController {
	
	@SuppressWarnings("resource")
	@PostConstruct
	void init() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "dubbo-config.xml" });
		context.start();
		CustomService demoService = (CustomService) context.getBean("myCustomService"); // 获取远程服务代理
		this.customService = demoService;
//		context.close();
	}
	
	//@Autowired
	private CustomService customService;
	
	@RequestMapping("/hello")
	public String index(){
	     String name=customService.getName();
	     System.out.println("getName=="+name);
		return "";
	}
 
}

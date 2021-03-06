package com.yc.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/manage/user")
public class ManageUserController {
	
	
	@Value("${eureka.client.serviceUrl.defaultZone}")
	String foo;
	
	@GetMapping("/hi")
	public Object hi(){
		return foo;
	}

}

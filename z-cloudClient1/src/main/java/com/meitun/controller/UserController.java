package com.meitun.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Value("${name}")
	private String name;
	
	@RequestMapping(value = "/getUserName")
	public String getUserName() {
		return name;
	}

}

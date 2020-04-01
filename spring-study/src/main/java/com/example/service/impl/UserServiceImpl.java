package com.example.service.impl;

import com.example.service.IUserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements IUserService {
	public UserServiceImpl(){
		System.out.println("construct...");
	}

	@Override
	public void query() {
		System.out.println("query...");
	}
}

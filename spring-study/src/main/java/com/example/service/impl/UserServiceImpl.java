package com.example.service.impl;

import com.example.mapper.IUserMapper;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserMapper userMapper;

	public UserServiceImpl(){
		System.out.println("construct...");
	}

	@Override
	public void query() {
		System.out.println("userMapper query()");
//		System.out.println(userMapper.query().toString());
	}
}

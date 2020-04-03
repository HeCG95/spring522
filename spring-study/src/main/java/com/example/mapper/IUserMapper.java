package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 这个类主要是用来测试 mybatis-spring 的实现
 * 如何自动生成 mapper 代理类
 */
public interface IUserMapper {

	@Select("select * from cdc_user")
	List<User> query();
}

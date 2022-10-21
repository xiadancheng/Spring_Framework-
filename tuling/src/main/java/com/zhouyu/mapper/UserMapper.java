package com.zhouyu.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserMapper {

	@Select("select 'user'")
	String selectById();

}

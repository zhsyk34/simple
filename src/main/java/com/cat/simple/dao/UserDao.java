package com.cat.simple.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.cat.simple.model.User;

public interface UserDao extends BaseDao<User> {

	List<User> findList(@Param("map") Map<String, Object> map);

	// List<User> findList(@Param("name") String name);
}

package com.ai.osrdc.core.req.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ai.osrdc.core.req.pojo.po.User;

public interface  UserDao extends JpaRepository<User, Long> {
	User findByName(String name);
	
	User findByNameAndAge(String name, Integer age);
}

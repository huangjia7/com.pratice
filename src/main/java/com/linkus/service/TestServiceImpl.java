package com.linkus.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements ITestService{
    @Autowired
    JdbcTemplate jdbcTemplate;
	
    public String home() {
//        return "Hello World!";
		List<Map<String, Object>> list = jdbcTemplate.queryForList("");
		return list.toString();
    }
}

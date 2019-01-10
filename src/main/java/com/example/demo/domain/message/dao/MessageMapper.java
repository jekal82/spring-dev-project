package com.example.demo.domain.message.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.message.dto.Message;

@Mapper
public interface MessageMapper {

	Message getMessage();
	
}

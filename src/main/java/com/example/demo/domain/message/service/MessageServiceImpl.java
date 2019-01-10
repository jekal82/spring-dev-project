package com.example.demo.domain.message.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.message.dao.MessageMapper;
import com.example.demo.domain.message.dto.Message;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	MessageMapper messageMapper;
	
	public String getMessageToService() {
		return "Service return Message!!!!!";
	}
	
	public String getMessageToDB() {
		
		Message message = messageMapper.getMessage();
		
		return message.getName();
	}
}

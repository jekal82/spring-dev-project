package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.message.service.MessageService;

@Controller
public class HelloWorldViewController {

	@Autowired
	private MessageService messageService;
	
	@RequestMapping("/view/helloworld.do")
	public ModelAndView index(Model model) {
		
		ModelAndView view = new ModelAndView("hello");
        view.addObject("text", "world");
        return view;
	}
	
	@RequestMapping("/view/getMessageToService.do")
	public ModelAndView getMessageToService(Model model) {
		
		ModelAndView view = new ModelAndView("hello");
        
		String text = messageService.getMessageToService();
		
		view.addObject("text", text);
        return view;
	}
	
	@RequestMapping("/view/getMessageToDB.do")
	public ModelAndView getMessageToDB(Model model) {
		
		ModelAndView view = new ModelAndView("hello");
        
		String text = messageService.getMessageToDB();
		
		view.addObject("text", text);
        return view;
	}
	
}

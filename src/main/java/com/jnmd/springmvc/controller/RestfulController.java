package com.jnmd.springmvc.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope("prototype")
public class RestfulController {

	@RequestMapping("/restfulController/{uid}/find")
	public ModelAndView get(@PathVariable("uid")int id){

		System.out.println("id = " + id);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("hello", "RESTful");
		mv.setViewName("hello");
		return mv;
		
	}
	
	@RequestMapping("/restfulController/{uid}/update")
	public ModelAndView update(@PathVariable("uid")int id){

		System.out.println("id = " + id);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("hello", "RESTful");
		mv.setViewName("hello");
		return mv;
		
	}
	
}

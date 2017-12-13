package com.jnmd.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope("prototype")
public class ReturnTestController {

	@RequestMapping(value="/testReturnStr", method=RequestMethod.GET)
	public String returnStr(HttpServletRequest request, HttpServletResponse response){
		System.out.println("return str...");
		// ...
		return "hello.jsp";
		// 请求转发的方式可以转发至/WEB-INF目录下的视图
		//return "/WEB-INF/jsp/test.jsp";
	}
	
	// 使用请求重定向的方式
	@RequestMapping("/testRedirect")
	public String testRedirect(HttpServletRequest request, HttpServletResponse response){
		System.out.println("testRedirect...");
		return "redirect:hello.jsp";
		// 重定向不能够定向至/WEB-INF目录下的视图
		//return "redirect:/WEB-INF/jsp/test.jsp";
	}
	
	@RequestMapping("testPrefixAndSuffix")
	public String testPrefixAndSuffix(){
		System.out.println("testPrefixAndSuffix...");
		// ...
		return "returnView";
	}
	
	@RequestMapping("testForward")
	public String testForward(){
		System.out.println("testForward...");
		// ...
		// 当前目标视图所在路径与配置文件中指定的前缀不同时
		return "forward:hello.jsp";
	}
	
	@RequestMapping("testModelAndView")
	public ModelAndView testModelAndView(){
		System.out.println("testModelAndView...");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("returnView");
		mv.addObject("mv", "ModelAndView test");
		
		return mv;
	}
}

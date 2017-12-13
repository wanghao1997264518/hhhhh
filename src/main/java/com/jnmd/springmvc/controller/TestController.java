package com.jnmd.springmvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("prototype")
public class TestController {

	@RequestMapping("testController")
	public void test(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		System.out.println("controller.test()...");
		request.setAttribute("hello","Annotation");
		request.getRequestDispatcher("hello.jsp").forward(request, response);
		
	}
	
}

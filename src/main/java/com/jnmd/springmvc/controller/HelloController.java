package com.jnmd.springmvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class HelloController extends MultiActionController {

	public void hello(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello method...");
		request.setAttribute("hello", "hello world");
		request.getRequestDispatcher("hello.jsp").forward(request, response);
	}

	public void test(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("test method...");
		request.setAttribute("hello", "test");
		request.getRequestDispatcher("hello.jsp").forward(request, response);
	}

}

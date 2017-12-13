package com.jnmd.springmvc.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.jnmd.springmvc.domain.Contact;
import com.jnmd.springmvc.domain.User;
@Controller
@Scope("prototype")
public class JsonController {
	/*
	 * @ResponseBody: 将方法返回的对象自动封装成为JSON格式的数据 适用于使用Ajax请求的方式来处理
	 */
	@RequestMapping("usejsonController")
	@ResponseBody
	public User getUser() {
		User user = new User();
		user.setAge(21);
		user.setUserName("张三");
		List<Contact> contacts = new ArrayList<Contact>();
		Contact c = new Contact("13100000000", "qw@qw.com");
		Contact c2 = new Contact("13200000000", "as@as.com");
		contacts.add(c);
		contacts.add(c2);
		user.setContacts(contacts);
		return user;
	}
	@RequestMapping("usegsonController")
	public void useGson(HttpServletRequest request, HttpServletResponse response) throws IOException {
		User user = new User();
		user.setAge(21);
		user.setUserName("李四");
		List<Contact> contacts = new ArrayList<Contact>();
		Contact c = new Contact("13300000000", "zx@zx.com");
		Contact c2 = new Contact("13400000000", "we@we.com");
		contacts.add(c);
		contacts.add(c2);
		user.setContacts(contacts);
		Gson gson = new Gson();
		String str = gson.toJson(user, User.class);
		// 指定响应数据格式及编码
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write(str);
		pw.flush();
		pw.close();
	}
	@RequestMapping("usefastsonController")
	public void useFastjson(HttpServletRequest request, HttpServletResponse response) throws IOException {
		User user = new User();
		user.setAge(21);
		user.setUserName("王五");
		List<Contact> contacts = new ArrayList<Contact>();
		Contact c = new Contact("13500000000", "rt@er.com");
		Contact c2 = new Contact("13600000000", "df@df.com");
		contacts.add(c);
		contacts.add(c2);
		user.setContacts(contacts);
		// 使用fastjson将指定的对象封装成为JSON格式的数据
		String str = JSON.toJSONString(user);
		// 指定响应数据格式及编码
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write(str);
		pw.flush();
		pw.close();
	}
}

package com.jnmd.springmvc.controller;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.jnmd.springmvc.domain.User;
@Controller
@Scope("prototype")
public class ParameterController {
	@RequestMapping("loginController")
	public ModelAndView login(@RequestParam(value="userName")String name, @RequestParam(value="password")String pwd){
		System.out.println("userName = " + name + ", pwd = " + pwd);	
		ModelAndView mv = new ModelAndView();
		mv.setViewName("loginSucc");
		mv.addObject("userName", name);
		mv.addObject("password", pwd);		
		return mv;
	}	
	@RequestMapping("regController")
	public ModelAndView regController(User user, String repwd){		
		System.out.println(user);
		System.out.println("确认密码: " + repwd);		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("regSucc");
		mv.addObject("user", user);
		return mv;
	}	
	@RequestMapping("regController2")
	public ModelAndView regController2(User user, String repwd, @DateTimeFormat(pattern="yyyy-MM-dd")Date date){		
		System.out.println(user);
		System.out.println("确认密码: " + repwd);
		System.out.println("出生年月: " + date);		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("regSucc");
		mv.addObject("user", user);
		return mv;
	}	
	@RequestMapping("regController3")
	public ModelAndView regController3(User user, String[] hobbys){		
		System.out.println(user);
		//System.out.println(hobby);
		System.out.println(Arrays.toString(hobbys));		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("regSucc");
		mv.addObject("user", user);
		return mv;
	}
	@RequestMapping("regController4")
	public ModelAndView regController4(User user, String[] hobbys){
		//System.out.println(hobby);
		String hobby = Arrays.toString(hobbys);
		user.setHobby(hobby.substring(1, hobby.length() - 1));
		System.out.println("hobby = " + hobby);		
		System.out.println("user = " + user);		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("regSucc");
		mv.addObject("user", user);
		return mv;
	}	
	@RequestMapping("regController5")
	public ModelAndView regController5(User user, String[] hobbys){
		//System.out.println(hobby);
		String hobby = Arrays.toString(hobbys);
		user.setHobby(hobby.substring(1, hobby.length() - 1));
		System.out.println("hobby = " + hobby);		
		System.out.println("user = " + user);		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("regSucc");
		mv.addObject("user", user);
		return mv;
	}	
	@RequestMapping("/regValidateController")
	public ModelAndView regValidateController(User user){
		ModelAndView mv = new ModelAndView();		
		Map<String, String> map = validate(user);
		if(map.size() > 0){
			mv.setViewName("forward:register.jsp");
			mv.addObject("errMsgs", map);
		}else{
			mv.setViewName("regSucc");			
		}		
		mv.addObject("user", user);		
		return mv;
	}	
	public Map<String, String> validate(User user){
		Map<String, String> map = new HashMap<String, String>();
		if(null == user.getUserName() || user.getUserName().trim().equals("")){
			map.put("nameError", "用户名必须输入!");
		}else if(user.getUserName().trim().length() < 2){
			map.put("nameError", "用户名长度不能少于2个!");
		}		
		if(null == user.getPassword() || user.getPassword().trim().equals("")){
			map.put("pwdError", "密码必须输入!");
		}else if(user.getPassword().trim().length() < 6){
			map.put("pwdError", "密码长度不能少于2个!");
		}
		// ...
		return map;
	}	
}

package com.jnmd.springmvc.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Scope("prototype")
public class FileUploadController {

	@RequestMapping("uploadController")
	public String uploadFile(HttpServletRequest request, @RequestParam("file")MultipartFile file){
		String path = 
				request.getSession().getServletContext().getRealPath("/upload");
		
		String fileName = file.getOriginalFilename();
		//System.out.println("fileName = " + fileName);
		
		File save = new File(path, fileName);
		
		try {
			// 直接将文件保存在指定的目录中
			file.transferTo(save);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "forward:fileList.jsp";
	}
	
}

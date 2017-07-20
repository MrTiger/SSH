package com.xc.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.xc.entity.User;
import com.xc.service.UserService;

@Controller
public class UserController {
	
	@Resource
	UserService userServiceImpl;
	
	@RequestMapping("/getAllUsers")
	public String getAllUsers(Model model){
		List<User> list=new ArrayList<User>();
		list=userServiceImpl.getAllUsers();
		model.addAttribute("list", list);
	return "getAllUsers";
	}
	
	@RequestMapping("/upload")
	public String upload(Model model,MultipartFile file) throws Exception{
		/*String realPath = request.getSession().getServletContext().getRealPath("C:\\Users\\Administrator\\Desktop");*/
		String realPath="C:\\Users\\Administrator\\Desktop\\";
        String filename = file.getOriginalFilename();
        System.out.println(filename);
        File targetfile = new File(realPath+filename);
        if(!targetfile.exists()){
        	targetfile.createNewFile(); 
        }
        file.transferTo(targetfile);
        model.addAttribute("message", "�ϴ��ɹ�");
       
        return "success";
	}
	
}

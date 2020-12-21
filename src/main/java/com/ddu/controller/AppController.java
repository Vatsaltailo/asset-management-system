package com.ddu.controller;




import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ddu.model.Admin;

import com.ddu.model.Complain;
import com.ddu.model.Student;

import com.ddu.services.AdminService;

import com.ddu.services.ComplainService;


import com.ddu.services.StudentService;

@Controller
public class AppController {

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private AdminService adminService;
	
	
	
	
	
	
	@Autowired
	private ComplainService complainService;
	
	
	
	
	@RequestMapping("/welcome")
	public String welcome(HttpServletRequest request)
	{
		request.setAttribute("mode","welcome");
		return "welcome";
	}
	
	@RequestMapping("/signin")//student==faculty
	public String signin(HttpServletRequest request)
	{
		request.setAttribute("mode","signin");
		return "welcome";
	}
	
	@RequestMapping("/signup")//Faculty signup
	public String adminRegister(HttpServletRequest request)
	{
		request.setAttribute("mode","signup");
		return "adminwelcome";
	}
	
	@RequestMapping("/adminsignin")//Main admin
	public String adminSignin(HttpServletRequest request)
	{
		request.setAttribute("mode","adminsignin");
		return "welcome";
	}
	@RequestMapping("/adminsignup")//admin signup
	public String adminsignup(HttpServletRequest request)
	{
		request.setAttribute("mode","adminsignup");
		return "adminwelcome";
	}
	
	
	@RequestMapping("/showcomplain")
	public String showcomplain(HttpServletRequest request,Model model)
	{
		List<Complain> complainlist=complainService.listall();
		model.addAttribute("complainlist",complainlist);
		System.out.println(complainlist);
		request.setAttribute("mode", "showcomplain");
		return "adminwelcome";
	}
	
	@PostMapping("/saveComplain")
	public String saveComplain(@ModelAttribute Complain complain,BindingResult bindingResult,HttpServletRequest request )
	{
		complain.setStatus("pending");
		complainService.save(complain);
		request.setAttribute("mode", "welcome");
		return "welcome";
	}
	
	@PostMapping("/saveuser")
	public String registerUser(@ModelAttribute Student student,BindingResult bindingResult,HttpServletRequest request)
	{
		studentService.save(student);
		request.setAttribute("mode", "welcome1");
		return "adminwelcome";
	}

	@PostMapping("/saveadmin")
	public String registerAdmin(@ModelAttribute Admin admin,BindingResult bindingResult,HttpServletRequest request)
	{
		adminService.save(admin);
		request.setAttribute("mode", "welcome");
		return "welcome";
	}

	
	@PostMapping("/welcomeuser")
	public String welcomeUser(@ModelAttribute Student student,BindingResult bindingResult,HttpServletRequest request)
	{
        int i=studentService.validate(student);
        if(i==0)
        {
	        request.setAttribute("mode", "welcome");
			return "complain";
	    }
        else
        {
        	request.setAttribute("mode", "signin");
        	return "welcome";
        }
	}
	
	@PostMapping("/welcomeadmin")
	public String welcomeAdmin(@ModelAttribute Admin admin,BindingResult bindingResult,HttpServletRequest request)
	{
        int i=adminService.validate(admin);
        if(i==0)
        {
	        request.setAttribute("mode", "welcome");
			return "adminwelcome";
	    }
        else
        {
        	request.setAttribute("mode", "adminsignin");
        	return "welcome";
        }
	}
	

}

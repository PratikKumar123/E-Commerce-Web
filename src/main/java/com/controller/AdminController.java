package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AdminController {
	
	@RequestMapping("/viewadmin")
	public String viewAdmin() {
		System.out.println("viewadmin called");
		return "admin";
	}
	
	@RequestMapping("/doadminregister")
	public String registerAdmin(@RequestParam("aemail") String adminemail, @RequestParam("apassword") String apassword,Model m) {
		
		if(adminemail.equals("admin@gamil.com") && apassword.equals("admin123")) {
			System.out.println("adminLogined called");
			m.addAttribute("msg1", "AdminLogin Successfully");
			return "addProduct";
		}else {
			m.addAttribute("failedAdmin", "Invalid email passowrd , Try again");
			return "admin";
		}
		
		
	}
		
	

}

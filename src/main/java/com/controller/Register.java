package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Service.RegisterService;

@Controller
public class Register {
	@Autowired
	private RegisterService rs;

	@RequestMapping("/register")
	public String showRegister() {
		System.out.println("Register called");
		return "register";

	}

	@RequestMapping(path = "/doregister", method = RequestMethod.POST)
	public String handlereg(@ModelAttribute com.Models.Register reg, Model m) {
		m.addAttribute("register", reg);
		int id = this.rs.createUser(reg);
		m.addAttribute("msg","User created with "+id);
		return "registersuccess";
	}

}

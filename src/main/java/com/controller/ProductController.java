package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	
	@RequestMapping(path="/productList")
	public String menProducts() {
		System.out.println("mens product called");
		return "menProducts";
		
	}
}

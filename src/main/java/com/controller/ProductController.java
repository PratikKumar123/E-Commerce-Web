package com.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Models.AddProduct;
import com.Models.WomenProduct;
import com.Service.ProductService;
import com.dao.ProductDao;
import com.dao.WomenDao;

@Controller
public class ProductController {
	@Autowired
	private ProductService ps;
	
	private ProductDao productDao = new ProductDao();
	private WomenDao womendao = new WomenDao();
	
	@RequestMapping(path="/productList")
	public String menProducts() {
		System.out.println("mens product called");
		return "menProducts";
		
	}
	
	@RequestMapping(path = "/productadd")
	public String addPro() {
		
		return "addProduct";
	}
	
	@RequestMapping(path = "/addproduct",method = RequestMethod.POST)
	public String addProduct(@ModelAttribute AddProduct addp, Model m1) {
		m1.addAttribute("msg","Product added to database");
		m1.addAttribute("product",addp);
		int id1 = this.ps.createProduct(addp);
		return "productAddSuccess";
	}
	@RequestMapping("/viewProduct/{productId}")
	public String viewProduct(@PathVariable String productId,Model m) throws IOException {
		
		AddProduct a = productDao.getprobyId(productId);
		m.addAttribute("getproduct",a);
		return "viewProduct";
	}
	
	@RequestMapping("/productList1")
	public String getProducts(Model m1) {
		List<AddProduct> pl = productDao.getProduct();
		AddProduct product1 = pl.get(0);
		AddProduct product2 = pl.get(1);
		AddProduct product3 = pl.get(2);
		AddProduct product4 = pl.get(3);
		AddProduct product5 = pl.get(4);
		AddProduct product6 = pl.get(5);
		AddProduct product7 = pl.get(6);
		m1.addAttribute("product1",product1);
		m1.addAttribute("product2",product2);
		m1.addAttribute("product3",product3);
		m1.addAttribute("product4",product4);
		m1.addAttribute("product5",product5);
		m1.addAttribute("product6",product6);
		m1.addAttribute("product7",product7);
		return "menProducts";
	}
	
	
	
	
	
	@RequestMapping("/womens")
	public String getProducts1(Model m2) {
		List<WomenProduct> pl = womendao.getProduct1();
		WomenProduct product1 = pl.get(0);
		WomenProduct product2 = pl.get(1);
		WomenProduct product3 = pl.get(2);
		WomenProduct product4 = pl.get(3);
		WomenProduct product5 = pl.get(4);
		WomenProduct product6 = pl.get(5);
		WomenProduct product7 = pl.get(6);
		m2.addAttribute("product1",product1);
		m2.addAttribute("product2",product2);
		m2.addAttribute("product3",product3);
		m2.addAttribute("product4",product4);
		m2.addAttribute("product5",product5);
		m2.addAttribute("product6",product6);
		m2.addAttribute("product7",product7);
		return "womensProduct";
	}
}

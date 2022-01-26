package com.sporty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sporty.dao.ProductDao;
import com.sporty.dao.UserDao;
import com.sporty.entity.Product;

@Controller
public class ProductController {
	@Autowired
	private ProductDao productDao;
	@RequestMapping("/add")
	public String CreateProduct(@RequestParam("name") String name,@RequestParam("price") Double price,@RequestParam("category") String category,@RequestParam("description") String description,Model model)
	{
		String page=null;
		Product product = new Product(name,price,category);
		
		product.setDescription(description);

		int counter = productDao.ProductAdd(product);

		if (counter > 0) {
			page="Success";
		} else {
			page="Error";
		}

		
		return page;
	}
	
	@RequestMapping("/addProduct")
	public String AddProduct(Model model) {
		return "AddProduct";
	}
}

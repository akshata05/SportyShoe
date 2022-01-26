package com.sporty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sporty.dao.ProductDao;
import com.sporty.dao.PurchaseDao;
import com.sporty.dao.UserDao;
import com.sporty.entity.Product;
import com.sporty.entity.Purchase;
import com.sporty.entity.User;

import java.util.ArrayList;
import java.util.List;
@Controller
public class PurchaseController {

	@Autowired
	private PurchaseDao purchaseDao;
	@Autowired
	private ProductDao productDao;
	@Autowired
	private UserDao userDao;
@RequestMapping("/purchase")
	public String List(Model model) {
List<Purchase> purchases=purchaseDao.purchaseList();
List<User> user=new ArrayList<User>();
Purchase tempPurchase=new Purchase();
List<Product> product=new ArrayList<Product>();;
		model.addAttribute("purchases", purchases);
		for(int i=0;i<purchases.size();i++) {
			tempPurchase=purchases.get(i);
		
			user.add(userDao.getUser(tempPurchase.getUserId()));
			
			product.add(productDao.getProduct(tempPurchase.getProductId()));
			
		}
		model.addAttribute("users", user);
		model.addAttribute("products", product);
		return "purchaseReport";
	}

}

package com.sporty.dao;

import java.util.List;

import com.sporty.entity.Product;
import com.sporty.entity.Purchase;
import com.sporty.entity.User;

public interface ProductDao {
	public int ProductAdd(Product product);
	public Product getProduct(String purchaseId);
}

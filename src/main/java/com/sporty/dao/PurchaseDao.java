package com.sporty.dao;

import java.util.List;

import com.sporty.entity.Product;
import com.sporty.entity.Purchase;


public interface PurchaseDao {

	public List<Purchase> purchaseList();
}

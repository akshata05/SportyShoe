package com.sporty.entity;

import java.util.Date;

public class Purchase {
	private String userId;
	private String productId;
	private Date date;
	
	public Purchase(String userId, String productId,Date date) {
		
		this.userId = userId;
		this.productId = productId;
		this.date=date;
	}
	
	public String getUserId() {
		return userId;
	}
	public Purchase() {
	
		// TODO Auto-generated constructor stub
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}

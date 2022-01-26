package com.sporty.entity;

import java.util.List;

public class User {
private String userId;
private String name;
public User() {

	// TODO Auto-generated constructor stub
}
public List<String> getProduct() {
	return product;
}
public void setProduct(List<String> product) {
	this.product = product;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public User(String userId, String name) {
	super();
	this.userId = userId;
	this.name = name;
}
private List<String> product;
}

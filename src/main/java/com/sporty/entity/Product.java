package com.sporty.entity;

public class Product {
private String id;
private String name;
private double price;
private String category;
private String description;

public Product() {

	// TODO Auto-generated constructor stub
}
public Product(String name, double price, String category) {
	super();
	this.name = name;
	this.price = price;
	this.category = category;
}
public String getId() {
	return id;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}

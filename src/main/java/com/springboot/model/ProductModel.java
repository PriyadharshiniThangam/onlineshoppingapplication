package com.springboot.model;

public class ProductModel {
private int id;
private String name;
private int price;
private int stockAvailable;
public int getId()
{
	return id;
}
public void setId(int id)
{
	this.id=id;
}
public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name=name;
}
public int getPrice()
{
	return price;
}
public void setPrice(int price)
{
	this.price=price;
}
public int getStockAvailable()
{
	return stockAvailable;
}
public void setStockAvailable(int stockAvailable) {
	this.stockAvailable=stockAvailable;
}
}


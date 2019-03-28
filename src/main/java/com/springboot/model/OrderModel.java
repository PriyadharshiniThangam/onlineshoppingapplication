package com.springboot.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderModel {
private int id;
private int customerid;
public int getId()
{
	return id;
}
public void setId(int id)
{
	this.id=id;
}
public int getCustomerId()
{
	return customerid;
}
public void setCustomerId(int customerid)
{
	this.customerid=customerid;
}
private String getDateTime() {
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();
    return dateFormat.format(date);
}
}
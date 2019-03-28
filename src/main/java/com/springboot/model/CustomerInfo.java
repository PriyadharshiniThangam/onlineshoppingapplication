package com.springboot.model;

public class CustomerInfo {
private int id;
private String name;
private String email;
private String encryptedPassword;
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
public String getEmail()
{
	return email;
}
public void setEmail(String email)
{
	this.email=email;
}
public String getEncryptedPassword()
{
	return encryptedPassword;
}
public void setEncryptedPassword(String encryptedPassword)
{
	this.encryptedPassword=encryptedPassword;
}
public CustomerInfo(int id,String name,String email,String encryptedPassword) {
	this.id=id;
	this.name=name;
	this.email=email;
	this.encryptedPassword=encryptedPassword;
}
public CustomerInfo() {
	
}
}


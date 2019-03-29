package com.capgemini.pwa.beans;

public class Customer {
	 String usernamez;
	 public String getUsernamez() {
		return usernamez;
	}
	public void setUsernamez(String usernamez) {
		this.usernamez = usernamez;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	String password;
	 String name;
	 String address;
	 String mobilenumber;
	 Wallet myWallet= new Wallet();
	   
	public Wallet getMyWallet() {
		return myWallet;
	}
	public void setMyWallet(Wallet myWallet) {
		this.myWallet = myWallet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


}

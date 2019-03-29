package com.capgemini.pwa.beans;

public class Wallet {
  String AccountID;
  
  double balance;
  
  
    
	public String getID() {
	return AccountID;
}



public Wallet(String accountID, double balance) {
		super();
		AccountID = accountID;
		this.balance = balance;
	}


  



public Wallet() {
	// TODO Auto-generated constructor stub
}



public void setID(String iD) {
	AccountID = iD;
}



public double getBalance() {
	return balance;
}



public void setBalance(double balance) {
	this.balance = balance;
}



}

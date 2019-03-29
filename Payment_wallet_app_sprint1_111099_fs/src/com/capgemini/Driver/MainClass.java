package com.capgemini.Driver;

import java.util.Scanner;

import com.capgemini.pwa.beans.Customer;
import com.capgemini.pwa.beans.Wallet;
import com.capgemini.pwa.dao.WalletDAOImp;

public class MainClass {

	public static void main(String[] args) {
		WalletDAOImp walletDao = new WalletDAOImp();
		Customer C1 = new Customer();
		Scanner scanz = new Scanner(System.in);
		System.out.println("Please enter your full name.");
		String name = scanz.next();
		C1.setName(name);
		System.out.println("Please enter your phone number.");
		String phonenum = scanz.next();
		C1.setMobilenumber(phonenum);	
		System.out.println("Please enter your full home address.");
		String address1 = scanz.next();
		C1.setAddress(address1);
		System.out.println("Enter username");
		String username1 = scanz.next();
		C1.setPassword(username1);
		System.out.println("Enter a password!");
		String pass1 = scanz.next();
		C1.setPassword(pass1);
		
		
		Wallet lowWallet = new Wallet();
		System.out.println("Enter ID");
		String ID = scanz.next(); 
		lowWallet.setID(ID);
		lowWallet.getBalance();  
	   C1.setMyWallet(lowWallet);
		
		
		Customer C2 = new Customer();
		System.out.println("Please enter your full name.");
	    name = scanz.next();
		C2.setName(name);
		System.out.println("Please enter your phone number.");
	   phonenum = scanz.next();
		C2.setMobilenumber(phonenum);	
		System.out.println("Please enter your full home address.");
		address1 = scanz.next();
		C2.setAddress(address1);
		System.out.println("Enter username");
		username1 = scanz.next();
		C2.setPassword(username1);
		System.out.println("Enter a password!");
		pass1 = scanz.next();
		C2.setPassword(pass1);
		
		
		Wallet highWallet = new Wallet();
		highWallet.setID(ID);
		highWallet.getBalance();
		C2.setMyWallet(highWallet);
		
		
		System.out.println("Transfer 100 Dollars from Richie to Sally");
		walletDao.transfer(C2.getMyWallet(),C1.getMyWallet(), 100);
		System.out.println("Richies Balance:" + C2.getMyWallet().getBalance()+"\n");
		System.out.println("Sally Balance:" + C1.getMyWallet().getBalance()+"\n");
		
		

	}

}

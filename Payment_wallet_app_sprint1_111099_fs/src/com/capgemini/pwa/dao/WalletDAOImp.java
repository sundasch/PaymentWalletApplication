package com.capgemini.pwa.dao;

import java.util.HashMap;
import java.util.Scanner;

import com.capgemini.pwa.beans.Customer;
import com.capgemini.pwa.beans.Wallet;

public class WalletDAOImp implements WalletDAO{
	
	private static HashMap<String,Wallet> walletMap = new HashMap<>();


	public HashMap<String, Wallet> getWalletMap() {
		return walletMap;
	}

	public void setWalletMap(HashMap<String, Wallet> walletMap) {
		this.walletMap = walletMap;
	}
	public static void createaccount(String usernamez, String password){
		if (walletMap.containsKey(usernamez)){
			System.out.println("Username already used!");
			return;
		}
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
		C1.setUsernamez(username1);
		System.out.println("Enter a password!");
		String pass1 = scanz.next();
		C1.setPassword(password);
		Wallet wallet1 = new Wallet("0001", 2000);
		
		walletMap.put(username1,wallet1);
		
		
	}
	@Override  
	public void transfer(Wallet wallet1, Wallet wallet2, double amountToTransfer) {
		
		double wallet1Balance = wallet1.getBalance();
		if(wallet1Balance>amountToTransfer){
			
			double balanceAfterSubtraction = wallet1Balance - amountToTransfer;
			wallet1.setBalance(balanceAfterSubtraction);
			
			double wallet2Balance = wallet2.getBalance();
			double wallet2NewBalance = wallet2Balance + amountToTransfer;
			wallet2.setBalance(wallet2NewBalance);
		}
		
	
		
	}

	@Override
	public void deposit(Wallet wallet, double amount) {
		double currentBalance = wallet.getBalance();
		
		wallet.setBalance(currentBalance + amount);
		
	}

	@Override
	public void withdraw(Wallet wallet, double amount) {
		
		double currentBalance = wallet.getBalance();
		if(currentBalance>amount)
		wallet.setBalance(currentBalance - amount);
		
	}

	@Override
	public Wallet findOne(String acountkey) {
		
		
		return (walletMap.get(acountkey));
		
		
		
	}

	@Override
	public void findAll() {
		
		
	}
	
	public void addWallet(Wallet wallet){
		
		String accountId = wallet.getID();
		
		walletMap.put(accountId, wallet);
		
		
	}

	
}

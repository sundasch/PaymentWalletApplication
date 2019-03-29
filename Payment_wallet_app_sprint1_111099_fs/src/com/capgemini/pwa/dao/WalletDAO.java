package com.capgemini.pwa.dao;

import com.capgemini.pwa.beans.Wallet;

public interface WalletDAO {
	//Wallet 1 should be the wallet from which the amount is going to transferred
	public void transfer(Wallet wallet1, Wallet wallet2,double amountToTransfer);
	public void deposit(Wallet wallet, double amount);
	public void withdraw(Wallet wallet, double amount);
	public Wallet findOne(String acountkey);
	public void findAll();
	public void addWallet(Wallet wallet);   
}
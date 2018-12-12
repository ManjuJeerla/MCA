package com.nt.listProjects;

public class BankAccount {
	
	long acno;
	String AccHolderName;
	double balance;
	String branch;
	public BankAccount(long acno, String accHolderName, double balance, String branch) {
		
		this.acno = acno;
		AccHolderName = accHolderName;
		this.balance = balance;
		this.branch = branch;
	}

	@Override
	public boolean equals(Object obj) {
	
		if(obj instanceof BankAccount) {
			BankAccount ba=(BankAccount)obj;
			
			return (this.acno==ba.acno) && (this.branch.equals(ba.branch));
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "ACNO::"+acno+" name::"+AccHolderName+" balance::"+balance+" branch::"+branch;
	}
}

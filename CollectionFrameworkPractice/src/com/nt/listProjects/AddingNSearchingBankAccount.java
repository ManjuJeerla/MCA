package com.nt.listProjects;

import java.util.ArrayList;

public class AddingNSearchingBankAccount {

	public static void main(String[] args) {
		
		ArrayList<Object> al=new ArrayList<>();
		
		al.add(new BankAccount(30101, "MJ", 10000, "ATP"));
		al.add(new BankAccount(30102, "DJ", 5000, "ATP"));
		al.add(new BankAccount(30103, "RJ",10000,"KLD"));
		
		System.out.println(al.contains(new BankAccount(30102, "GJ",50000, "ATP")));
		System.out.println(al.contains(new BankAccount(30101, "JK", 50000, "ATP")));
		

	}

}

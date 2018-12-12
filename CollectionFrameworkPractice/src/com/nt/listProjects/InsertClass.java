package com.nt.listProjects;

import java.util.ArrayList;

public class InsertClass {

	public static void main(String[] args) {
     
		ArrayList<Object> al=new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("d");
		System.out.println("Original Elements::"+al);
		
		al.add("b");
		System.out.println("Changed Elements::"+al);


	}

}

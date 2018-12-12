package com.nt.listProjects;

import java.util.ArrayList;

public class ReplaceClass {

	public static void main(String[] args) {
		
		ArrayList<Object> al=new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		
		System.out.println("Origingal Elements::"+al);
		
		String s1=(String)al.get(1);
		String s2=s1.toUpperCase();
		al.set(1, s2);
		
		System.out.println("Changed Elemetns::"+al);

	}

}

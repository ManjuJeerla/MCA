package com.nt.listProjects;

import java.util.ArrayList;

public class InsertTestCase {

	public static void main(String[] args) {
		
		ArrayList<Object> al=new ArrayList<>();
		System.out.println(al);
		
		al.add(0,"a");//appended
		al.add(1,"b");//appended
		
		System.out.println(al);
		
		//al.add(5,"e");//RE:IOBE
		System.out.println(al);

	}

}

package com.nt.listProjects;

import java.util.ArrayList;

public class RemoveClass1 {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();
		
		al.add(new A(5));
		al.add(new A(6));
		al.add(new A(7));
		System.out.println(al);
		al.remove(new A(7));
		System.out.println(al);
		

	}

}

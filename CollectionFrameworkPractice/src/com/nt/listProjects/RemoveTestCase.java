package com.nt.listProjects;

import java.util.ArrayList;

public class RemoveTestCase {

	public static void main(String[] args) {
		
		ArrayList<Object> al=new ArrayList<>();
		
		System.out.println(al);
		
		for(int i=0;i<10;i++) {
			System.out.println(i*10);
		}
		/*al.remove(1);//IOBE because data is not stored into the Collection
		al.remove(2);
		*/
		System.out.println(al);
	}

}

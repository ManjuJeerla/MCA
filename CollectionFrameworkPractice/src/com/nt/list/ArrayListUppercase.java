/*write a program for adding string objects to arraylist,display them in console as uppercase*/
package com.nt.list;

import java.util.*;

public class ArrayListUppercase {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
        
		for(int i=0;i<al.size();i++) {
			al.get(i);
		Object obj=al.get(i);
		String str=(String) obj;
		System.out.println(str.toUpperCase());
		}
		System.out.println();
		System.out.println(al);
	}

}

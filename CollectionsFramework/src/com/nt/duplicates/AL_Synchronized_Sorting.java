package com.nt.duplicates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AL_Synchronized_Sorting {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("e");
		System.out.println(al);
		//obtainig sysnchronized list
		List<String> syncList=Collections.synchronizedList(al);
		al.add("d");
		System.out.println("after adding new element syncList::"+syncList);
		System.out.println("After adding new element Arraylist::"+al);
		
		
	}

}

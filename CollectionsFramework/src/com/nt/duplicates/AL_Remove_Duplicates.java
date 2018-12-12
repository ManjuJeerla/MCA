package com.nt.duplicates;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class AL_Remove_Duplicates {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();
		//al.add("a");
		//al.add("b");
		//al.add("c");
		al.add(new A(5, 6));
		al.add(new A(5, 6));

		System.out.println("Original AL::" + al);
		removeDuplicates(al);
		System.out.println("Modified AL::" + al);
	}

	public static void removeDuplicates(List<Object> list) {

		// Approach#1 using LinkedHashSet
		//LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		//lhs.clear();
		//lhs.addAll(lhs);
		
		//Approach#2 BY Using our Own talent
		for(int i=0;i<list.size();i++) {
			Object obj1=list.get(i);
			for(int j=i+1;j<list.size();j++) {
				Object obj2=list.get(j);
				
				if(obj1.equals(obj2)) {
					list.remove(i);
				}
			
			}
		}
	}
}

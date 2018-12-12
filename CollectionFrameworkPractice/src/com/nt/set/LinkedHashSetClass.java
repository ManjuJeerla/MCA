package com.nt.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		
		LinkedHashSet<Object> lhs=new LinkedHashSet<>();
		
		store(lhs);
		System.out.println(lhs);//[a, b, c, true]->because collections classes are runtime Polymorphism classes , we can call add() method to all collections as shown below store() method. 
		
		lhs.add("a");
		lhs.add('b');
		lhs.add("c");
		lhs.add(true);
		
		System.out.println(lhs);//[a, b, c, true, b]->insertion order is preserved...
		
	}

	static void store(Set<Object> s) {
		
		s.add("a");
		s.add("b");
		s.add("c");
		s.add(true);
		
	}
}


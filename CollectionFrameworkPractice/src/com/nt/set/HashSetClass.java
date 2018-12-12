package com.nt.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {

	public static void main(String[] args) {

		HashSet<Object> hs = new HashSet<>();
		//HashSet<Object> hs=new HashSet<>(4);
		//HashSet<Object> hs=new HashSet<>(4,0.75f);
		//HashSet<Object> hs=new HashSet<>(Collection c);
		store(hs);
		System.out.println(hs);//[a, b, c, 5]->because collections classes are runtime Polymorphism classes , we can call add() method to all collections as shown below store() method. 
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add(5);
		hs.add(true);

		System.out.println(hs);//[a, b, c, 5, true] ->not an insertion order
		System.out.println(hs.size());
	}

static void store(Set<Object> s) {
		s.add("a");
		s.add("b");
		s.add("c");
		s.add(5);
		

	}
	
}

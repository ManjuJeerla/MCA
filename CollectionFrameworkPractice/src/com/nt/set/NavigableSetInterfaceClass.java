package com.nt.set;

import java.util.TreeSet;

public class NavigableSetInterfaceClass {

	public static void main(String[] args) {
		
		TreeSet<Object> ts=new TreeSet<>();
		
		ts.add(1000);
		ts.add(2000);
		ts.add(3000);
		ts.add(4000);
		ts.add(5000);
		
		System.out.println(ts);//[1000, 2000, 3000, 4000, 5000]
		
		System.out.println(ts.ceiling(1000));//it returns lowest element which is>=e   ===>1000
		System.out.println(ts.higher(2000));//it returns highest element which is >e   ===>3000
		System.out.println(ts.floor(3000)); //it returns lowest element which is <=e   ===>3000 
		System.out.println(ts.lower(3000)); //it returns highest element which is <e   ===>2000
		System.out.println(ts.pollFirst()); //it removes and returns first element     ===>1000
		System.out.println(ts.pollLast());  //it removes and returns last element      ===>5000
		System.out.println(ts.descendingSet());//it returns Navigableset in reverse order...[4000,3000,2000]
		
		System.out.println(ts);//[2000, 3000, 4000]...
	}

}

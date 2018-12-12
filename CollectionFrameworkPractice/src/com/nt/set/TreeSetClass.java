package com.nt.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
	
		TreeSet<Object> ts=new TreeSet<>();
		
		store(ts);
		ts.add("a");
		ts.add("b");
		ts.add("c");
		ts.add("d");
		//ts.add(null); RE:NullPointerException.....
		System.out.println(ts);
		/*ts.add(true);
		ts.add(5.8f);    we will add only homogeneous objects it you try to add
		ts.add(5.5);     we will get RE:ClassCastException...
		ts.add('a');
		*/
		System.out.println(ts);/*by default it will acts as default natural sorting order 
		                       based on the passed objects type like Stirng or Integer
		                       Integers-----Sequential Order(Ascending order)..
		                       String-------Alphabetical Order...  
                                 */ 
		
	}
	
	static void store(Set<Object> s) {
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
	}

}

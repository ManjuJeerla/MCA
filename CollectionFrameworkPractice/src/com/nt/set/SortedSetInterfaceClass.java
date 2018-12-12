package com.nt.set;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterfaceClass {

	public static void main(String[] args) {
	
		SortedSet<Object> ss=new TreeSet<>();
		store(ss);
		ss.add("a");
		ss.add("b");
		ss.add("c");
		ss.add("d");
		//ss.add(null); RE:NullPointerException.....
		System.out.println(ss);
		
		System.out.println("==============================");
		//perform sortedset specific methods
	    
		System.out.println(ss.first());//returns first element of ss

		System.out.println(ss.last());//returns last element of ss
		
		System.out.println(ss.tailSet("b"));//returns ss whose elemetns are less than object
		
		System.out.println(ss.headSet("b"));//returns ss whose elements are >=object
		
		System.out.println(ss.subSet("a","d"));//returns >=obj1 and <obj2
		
		//System.out.println(Comparator c));//--->returns null if our sorting order is default natural sorting order otherwise passed comparator class object returned...
		
		/*ts.add(true);
		ss.add(5.8f);    we will add only homogeneous objects it you try to add
		ss.add(5.5);     we will get RE:ClassCastException...
		ss.add('a');
		*/
		System.out.println(ss);/*by default it will acts as default natural sorting order 
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

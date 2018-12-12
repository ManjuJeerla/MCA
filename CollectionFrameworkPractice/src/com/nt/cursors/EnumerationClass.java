package com.nt.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationClass {

	public static void main(String[] args) {
		
		Vector<Object> v=new Vector<>();
		
		v.add("a");
		v.add("b");
		v.add("c");
		v.add("d");
		v.add("e");
		
		System.out.println(v);
		
		Enumeration<Object> e=v.elements();//elements() method can be used to retrieve the data
		while(e.hasMoreElements()) {       //It verify whether the  element is available in the next location or not
			Object obj=e.nextElement();    //It is used for retrieving the Objects from the collecion
			                               //1.cursor will move the next location
		System.out.println(obj);           //2.returns the element from the next location
			
		}

	}

}

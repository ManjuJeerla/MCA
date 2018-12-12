package com.nt.cursors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class RetrievingEnumerationFromArrayList {

	public static void main(String[] args) {
		
      ArrayList<Object> al=new ArrayList<>();
      
      al.add("a");
      al.add("b");
      al.add("c");
      al.add("d");
      System.out.println(al);
      Enumeration<Object> e=Collections.enumeration(al);
      while(e.hasMoreElements()) {
    	  Object obj=e.nextElement();
    	  System.out.println(obj);
      }
      System.out.println(al);
	}

}

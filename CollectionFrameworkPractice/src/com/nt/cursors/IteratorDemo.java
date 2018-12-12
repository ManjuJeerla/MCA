package com.nt.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<Object> al=new ArrayList<>();
	
	 	for(int i=0;i<10;i++) {
	      al.add(i);
	     // al.remove(3); IOOBE
	     // Object obj=al.get(3); IOOBE
	 	}
		System.out.println(al);
		Iterator<Object> itr=al.iterator();
		while(itr.hasNext()) {
			Integer i=(Integer) itr.next();
			if(i%2==0)
			System.out.println(i);
			else
				itr.remove();
		}
		System.out.println(al);
	}

}

package com.nt.cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo2 {

	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add(1);
		al.add("b");
		al.add(2);
		al.add("c");
		al.add(3);

		System.out.println(al);

		ListIterator<Object> litr=al.listIterator();
		int count=1;
		while(litr.hasNext()) {
			Object obj=litr.next();
			if(obj instanceof String) {
				litr.set(((String) obj).toUpperCase());
			}
			else if(obj instanceof Integer) {
				if(count==1) {
				litr.add(20); 
				count++;
			}
			}
		}
		
		while(litr.hasPrevious()) {
			Object obj=litr.previous();
		}
		System.out.println(al);
	
	}
}
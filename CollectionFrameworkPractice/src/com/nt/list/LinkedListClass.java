package com.nt.list;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<Object> ll=new LinkedList<>();
		
		System.out.println("isEmpty()::"+ll.isEmpty());
		ll.add("a");
		ll.add(5);
		ll.add("a");
		ll.add("java");
		ll.add("A");
		ll.add(null);
		ll.add(null);
		ll.add(null);
		ll.add(true);
		ll.add(5.6);
		ll.add(5.6f);
		
		System.out.println("size is::"+ll.size());
		System.out.println("elements are::"+ll);
		
		System.out.println("remove object"+ll.remove(5));
		System.out.println("insert object::"+ll.add(5));
		
		

	}

}

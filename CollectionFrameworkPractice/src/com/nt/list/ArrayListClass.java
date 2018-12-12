package com.nt.list;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();
		System.out.println("isEmpty()::"+al.isEmpty());
		al.add("a");
		al.add(5);
		al.add("a");
		al.add("java");
		al.add("A");
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(true);
		al.add(5.6);
		al.add(5.6f);
		System.out.println("size is::"+al.size());
		System.out.println("elements are::"+al);
		//retrieving the objects randomly
		System.out.println(al.get(3));
		//removing the objects
		System.out.println(al.remove(5));
		System.out.println(al);

	}

}

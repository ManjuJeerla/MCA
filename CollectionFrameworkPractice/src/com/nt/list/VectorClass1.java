package com.nt.list;

import java.util.Vector;

public class VectorClass1 {

	public static void main(String[] args) {
		Vector<Object> v=new Vector<>();
		System.out.println("isEmpty()::"+v.isEmpty());
		v.add("a");
		v.add("b");
		v.add("a");
		v.add("null");
		v.add(null);
		v.add(null);
		v.add(null);
		v.add(5.6f);
		v.add(5.6);
		v.add(true);
		System.out.println("capacity::"+v.capacity());
		System.out.println("size is::"+v.size());
		System.out.println("3rd elements is::"+v.get(3));
	}

}

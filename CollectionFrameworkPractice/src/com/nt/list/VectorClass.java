package com.nt.list;

import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector<Object> v=new Vector<>();
		System.out.println("initial capacity::"+v.capacity());
		System.out.println("initial size::"+v.size());
		for(int i=0;i<10;i++) {
			v.addElement(i);
		}
		System.out.println("after adding elements capacity::"+v.capacity());
		System.out.println("after adding elements size::"+v.size());
		v.addElement("a");
		v.add(10, "a");
		System.out.println(v);
		System.out.println("incremental capacity::"+v.capacity());
		System.out.println("incremental size::"+v.size());
		System.out.println("======================================");
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.elementAt(5));
		System.out.println(v.get(5));
		System.out.println("===============================");
		System.out.println(v.remove(5));
		System.out.println(v);
		System.out.println(v.removeElement(6));
		System.out.println(v);
		System.out.println(v.remove("a"));
		System.out.println(v);
		v.removeElementAt(0);
		System.out.println(v);
		v.removeAllElements();
		System.out.println(v);
		v.clear();
		System.out.println(v);
		
	}

}

package com.nt.cursors;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class InternalsofCursors {

	public static void main(String[] args) {
		Vector<Object> v=new Vector<>();
		
		Enumeration<Object> e=v.elements();
		Iterator<Object> itr=v.iterator();
		ListIterator<Object> litr=v.listIterator();
		
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(litr.getClass().getName());
	}

}

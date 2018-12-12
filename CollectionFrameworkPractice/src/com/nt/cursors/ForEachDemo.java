package com.nt.cursors;

import java.util.ArrayList;

public class ForEachDemo {

	public static void main(String[] args) {
		
		ArrayList<Object> al=new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		System.out.println(al);
		/*Object obj;
		for(obj:al) {//CE
			System.out.println(obj);
		}*/
		for(Object obj:al) {//CE
			if(obj instanceof String);
			String str=(String)obj;
			System.out.println(str.toUpperCase());
		}
			System.out.println(al);
	
	}

}

package com.nt.listProjects;

import java.util.ArrayList;

public class RemoveClass {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();
		
		/*al.add("a");
		al.add("b");
		al.add("c");
		al.add("a");
		System.out.println(al);
		//Case1::Removing String Objects from the collection
		al.remove(new String("a"));
		System.out.println(al);
        */
		
		//case2::Removing Integer Objects from the collection
		/*al.add("5");
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		System.out.println(al);
		al.remove(5);
		System.out.println(al);
		//al.remove(10);AIOBE
		al.remove(new Integer(5));
		System.out.println(al);
		al.remove(new Integer(10));
		System.out.println(al);
		*/
		
		//Case3::Removing Character Objects From the Collection
		/*al.add('a');
		al.add('b');
		al.add('c');
		System.out.println(al);
		//al.remove('b'); returns 98 index number so it gets AIOBE
		al.remove(new Character('b'));
		System.out.println(al);*/
		
		//Case4::Removing long,double,float,boolean objects from the collection
		/*al.add(5);
		al.add(5L);
		al.add(7.0);
		al.add(8.0f);
		al.add(true);
		al.add(false);
		al.add('a');
		
		System.out.println(al);
		
		al.remove(5);
		al.add(true);
		System.out.println(al);
		
		al.remove(5L);
		System.out.println(al);
		
		//al.remove('a');//97 AIOBE
		
		al.remove("a");//String "a" is not available , no element removed
		System.out.println(al);
		
		al.remove(8.0);//Double "8.0" not found , so no element removed
		System.out.println(al);
		
		al.remove(7.0);
		System.out.println(al);
		
		al.remove(true);
		System.out.println(al);*/
		
		//Case5::Removing StringBuilder object from the Collection
		
		al.add(new StringBuilder("a"));
		al.add(new StringBuilder("b"));
		System.out.println(al);
		
		StringBuilder sb=new StringBuilder("c");
		al.add(sb);
		System.out.println(al);
		
		al.remove(new StringBuilder("a"));//no object is removed from the collection because equals() method is not overriden in StringBuilder class
		System.out.println(al);
		
		al.remove(sb);
		System.out.println(al);
		
		

	}

}

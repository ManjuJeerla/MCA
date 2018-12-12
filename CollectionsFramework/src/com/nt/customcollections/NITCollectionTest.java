package com.nt.customcollections;

public class NITCollectionTest {
	
	public static void main(String[] args) {
		
		NITCollection col=new NITCollection();
			
		System.out.println("capacity of the array before adding the elements::"+((NITCollection) col).capacity());
		System.out.println("size of the array before adding the elements::"+((NITCollection) col).size());
		col.add("a");
		col.add(10);
		col.add(10.5f);
		col.add(10.50);
		col.add(true);
		col.add('c');
		col.add('a');
		col.add('r');
		col.add('b');
		col.add("PSPK");
		System.out.println("capacity of the array after adding the elements::"+((NITCollection) col).capacity());
		System.out.println("size of the array after adding the elements::"+((NITCollection) col).size());
		System.out.println(col);
		
		System.out.println("Retrieve the object reference from the given index location then return it to the caller.....");
		Object obj=col.get(5);
		System.out.println(obj);
		
		System.out.println("Assigns the given object to the given index location then existing object is replcaed with new given object...");
		col.replace(5, "j");
		System.out.println(col);
		
		System.out.println("1.move elements one location LEFT from the given index+1 to size-1");
		System.out.println("2.z In Size-1 place store it null");
		System.out.println("3.Decrease size by 1");

		col.remove(5);
		System.out.println(col);
		
		
	}

}

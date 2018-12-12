package com.nt.collections;

import javax.print.attribute.Size2DSyntax;

public class NITCollections {

	//storing / collecting an objects
	private Object[] object=new Object[10];
	//maintains array index and also size
	private int index=0;
	//adding the objects in a collections
	public void add(Object obj) {
		if(size()==capacity()) {
			incrementCapacity();
		}
		object[index]=obj;
		index++;
	}
	public int size() {//meant for no.of objects we have to store and maintained by index variable and return it
		return index;
	}
	public int capacity() {//meant for no.of objects we can store and nothing but length of an array
		return object.length;
	}
	public void incrementCapacity() {//this method is called only when size=caacity to increase current capacity to double
		Object[] tempObject=new Object[capacity()*2];
		for(int i=0;i<object.length;i++) {
			tempObject[i]=object[i];
		}
		object=tempObject;
	}
	//all the above 4 methods are used for solving array size problem
	
	public Object get(int i) {//meant for retrieving and returning given index object
		return object[i];
	}
	
	public void replace(int i,Object obj) {//this method replaces the given index obj with new given object in this collection
		object[i]=obj;
	}
}

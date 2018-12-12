package com.nt.listProjects;

public class A {

	int x;
	
	public A(int x) {
		this.x=x;
	}
	
	@Override
	public String toString() {    //with this change object is not removed Object data is displayed
	return "Integer Is::("+x+")";
	}
	
	/*@Override
	public boolean equals(Object obj) {  //with this change 1st Object in the collection is removed
		
		return true;
	}*/
	
	@Override
	public boolean equals(Object obj) {   //with this change exact object is removed from the collection.
	
		if(obj instanceof A) {
			A a=(A)obj;
			return (this.x==a.x);
		}
		return false;
	
	}
	
}

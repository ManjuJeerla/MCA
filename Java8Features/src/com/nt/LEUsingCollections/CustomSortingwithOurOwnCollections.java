package com.nt.LEUsingCollections;

import java.util.ArrayList;
import java.util.Collections;

class Example{
	int eno;
	String ename;
     public Example(int eno,String ename) {
    	 this.eno=eno;
    	 this.ename=ename;
	}
    @Override
	public String toString() {
    	return eno+":"+ename;
    }
}

public class CustomSortingwithOurOwnCollections {

	public static void main(String[] args) {
		
		ArrayList<Example> al=new ArrayList<>();
		al.add(new Example(101, "raja"));
		al.add(new Example(102, "ravi"));
		al.add(new Example(103, "rani"));
		al.add(new Example(101,"raja"));
		al.add(new Example(105, "Hari"));
		al.add(new Example(104, "MJ"));
		
		System.out.println("Before sorting::"+al);
		
		Collections.sort(al, (e1,e2)->(e1.eno>e2.eno)?-1:(e1.eno<e2.eno)?1:0);
		
		System.out.println("After Sorting::"+al);
		
	}

}

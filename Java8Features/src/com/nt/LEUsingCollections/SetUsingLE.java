package com.nt.LEUsingCollections;

import java.util.TreeSet;

public class SetUsingLE {

	public static void main(String[] args) {
		//TreeSet<Integer> ts=new TreeSet<>();//Default natural sorting order
		TreeSet<Integer> ts=new TreeSet<>((i1,i2)->(i1>12)?-1:(i1<12)?1:0);//Customized sorting order
		ts.add(10);
		ts.add(0);
		ts.add(5);
		ts.add(15);
		ts.add(20);
		ts.add(25);
		
		System.out.println(ts);
		
	}

}

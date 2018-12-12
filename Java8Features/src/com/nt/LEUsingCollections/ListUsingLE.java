package com.nt.LEUsingCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*class MyComparator implements Comparator<Integer>{
    
	//Approach1:
	public int compare(Integer i1, Integer i2) {
		
		if(i1>i2) {
			return -1;
		}
		else if(i1<i2) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	//Approach2:
	@Override
	public int compare(Integer i1, Integer i2) {
		return (i1>i2)?-1:(i1<12)?-1:0;
	}

	
}
*/
public class ListUsingLE {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(0);
		al.add(5);
		al.add(20);
		al.add(15);
		
		System.out.println("before Sorting::"+al);
		
	    Collections.sort(al, (i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);   
	    
		
		System.out.println("After sorting::"+al);

	}

}

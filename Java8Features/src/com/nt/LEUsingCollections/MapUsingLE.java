package com.nt.LEUsingCollections;

import java.util.TreeMap;
import java.util.TreeSet;

public class MapUsingLE {

	public static void main(String[] args) {
		//TreeMap<Integer, String> tm=new TreeMap<>();//Default natural Sorting order by using keys
		TreeMap<Integer,String> tm=new TreeMap<>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);//Customized sorting order
		tm.put(100, "Bunny");
		tm.put(500, "Munny");
		tm.put(400, "Chinny");
		tm.put(600, "Honey");
		tm.put(200, "Jinny");
		tm.put(300, "Pinny");
		
		System.out.println(tm);
		
	}

}

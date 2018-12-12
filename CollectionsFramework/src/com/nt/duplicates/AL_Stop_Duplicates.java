package com.nt.duplicates;

import java.util.ArrayList;

public class AL_Stop_Duplicates {
	static ArrayList<String> al = new ArrayList<>();

	/*
	 * static void addUniques(Object obj) { if(al.contains(obj)) { al.add(obj);
	 * al.add("a"); al.add("b"); al.add("a"); } }
	 */
	public void addToList(String newEntry) {
		if (!al.contains(newEntry))
			al.add(newEntry);
	}

	public static void main(String[] args) {

		System.out.println("al::" + al);

	}

}

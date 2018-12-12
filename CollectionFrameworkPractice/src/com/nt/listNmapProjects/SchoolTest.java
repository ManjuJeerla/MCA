package com.nt.listNmapProjects;

import java.util.LinkedHashSet;

public class SchoolTest {

	public static void main(String[] args) {
		
		LinkedHashSet<Object> lhs=new LinkedHashSet<>();
		
		lhs.add(new Student(101, "HK", "Corejava", 1000));
		lhs.add(new Student(102, "raja", "ADVJAVA", 2000));

		lhs.add(new Student(101, "HK", "Corejava", 1000));
		lhs.add(new Student(102, "raja", "ADVJAVA", 2000));
		
		lhs.add(new Student(103, "HK", "crt", 1000));
		lhs.add(new Student(104, "raja", "oracle", 2000));
		
		System.out.println(lhs);
		
		lhs.remove(new Student(101, "HK", "Corejava", 1000));
		
		System.out.println(lhs);


	}

}

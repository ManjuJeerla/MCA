package com.nt.TSTMProjects;

import java.util.TreeSet;

public class SchoolTest {

	public static void main(String[] args) {
		//TreeSet<Object> ts=new TreeSet<>();
		//TreeSet<Object> ts=new TreeSet<>(new StudentRNSOComparator());--->for ReverseNaturalSortingOrder
		TreeSet<Object> ts=new TreeSet<>(new StudentHeightComparator());
		
		ts.add(new Student(111, "hk", "corejava", 1000, 5.6));
		ts.add(new Student(112, "rk", "advjava", 2000, 5.8));
		/*ts.add(new Student(111, "rk", "oracle", 1000, 5.9));
		ts.add(new Student(104, "hk", "spring", 1600, 5.6));
		ts.add(new Student(105, "mj", "Hibernate", 1200, 5.8));
		ts.add(new Student(106, "jk", "angularjs", 1000, 5.8));
		*/
		System.out.println(ts);

	}

}

package com.nt.TSTMProjects;

import java.util.Comparator;

public class StudentRNSOComparator implements Comparator<Object>{

	@Override
	public int compare(Object obj1, Object obj2) {
		Student s1=(Student) obj1;
		Student s2=(Student) obj2;
		return s2.compareTo(s1);
	}
	
	

}

package com.nt.listNmapProjects;

import java.util.HashMap;

public class CourseMap {
	
	private static HashMap<String, Integer> hm=new HashMap<>();
	
	static {
           hm.put("CRT", 1);
           hm.put("C", 2);
           hm.put("CORE JAVA", 3);
           hm.put("ADVJAVA", 4);
           hm.put("ORACLE", 5);
	}
	//define getCourseNum() method for retrieving given coursenumbers...
	
	public static int getCourseNum(String course) {
		return (Integer)hm.get(course.toUpperCase());
	}

}

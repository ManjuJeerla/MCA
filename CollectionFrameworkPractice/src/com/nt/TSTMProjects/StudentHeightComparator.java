package com.nt.TSTMProjects;

import java.util.Comparator;

import com.nt.listNmapProjects.CourseMap;

public class StudentHeightComparator implements Comparator<Object> {

	@Override
	public int compare(Object obj1, Object obj2) {
		
		Student s1=(Student)obj1;
		Student s2=(Student)obj2;
		
		int foCourseNum=CourseMap.getCourseNum(s1.getCourse());
		int soCourseNum=CourseMap.getCourseNum(s2.getCourse());
		
		int courseDiff=foCourseNum-soCourseNum;
		if(courseDiff!=0) {
			return courseDiff;
		}
		else {
			int rollNumDiff=s1.getRollNum()-s2.getRollNum();
			
			if(rollNumDiff==0) {
				return 0;
			}
			else {
				double heightDiff=s1.getHeight()-s2.getHeight();
				if(heightDiff!=0) {
					if(heightDiff<0) {
						return 5;
					}
					else {
						return -5;
					}
				}
				else return rollNumDiff;
			}
		}
	}

}

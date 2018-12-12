package com.nt.listNmapProjects;

import java.util.HashMap;

public class Student {
	
	private int sno;
	private String sname;
	private String course;
	private int fees;
	
	public Student(int sno, String sname, String course, int fees) {
	
		this.sno = sno;
		this.sname = sname;
		this.course = course;
		this.fees = fees;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	@Override
	public int hashCode() {
		return CourseMap.getCourseNum(course.toUpperCase());
		//return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student st=(Student)obj;
			return this.sno==st.sno && this.course.equals(st.course); 
		}
		return false; 
	}
	
	@Override
	public String toString() {
	return sno+" "+sname+" "+course+" "+fees;
	
	}
}

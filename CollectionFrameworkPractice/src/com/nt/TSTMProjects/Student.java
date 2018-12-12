package com.nt.TSTMProjects;

import com.nt.listNmapProjects.CourseMap;

public class Student implements Comparable<Object>{

	private int rollNum;
	private String sname;
	private String course;
	private int fees;
	private double height;
	
	public Student(int rollNum, String sname, String course, int fees, double height) {
	
		this.rollNum = rollNum;
		this.sname = sname;
		this.course = course;
		this.fees = fees;
		this.height = height;
	}

	@Override
	public int compareTo(Object obj) {
		Student s=(Student)obj;
		int foCourseNum=CourseMap.getCourseNum(this.course);
		int soCourseNum=CourseMap.getCourseNum(s.course);
        int courseDiff=foCourseNum-soCourseNum;//here "fo" means firstObject and "so" means second object
        
        if(courseDiff!=0) {
        return courseDiff;
        }
		
		return this.rollNum-s.rollNum;
	}

	@Override
	public String toString() {
		return  "("+ rollNum + ", " + sname + ", " + course + ", " + fees + ", " + height+")" ;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
	
}

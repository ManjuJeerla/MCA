package com.nt.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import com.nt.bean.StudentBean;
import com.nt.dao.StudentDAO;

public class FrontOfficeTest {

	public static void main(String[] args) {
     
		StudentDAO dao=new StudentDAO();
		Scanner sc=new Scanner(System.in);
		while(true) {
          System.out.println("Enter Course::");
          String course=sc.nextLine();
          ArrayList<Object> al=dao.getStudents(course);
          System.out.println("sno::"+" "+"sname"+" "+"course"+" "+"Fees");
          for(int i=0;i<al.size();i++) {
        	  StudentBean sb=(StudentBean)al.get(i);
        	  
        	  System.out.println(sb.getSno());
        	  System.out.println(sb.getSname());
        	  System.out.println(sb.getCourse());
        	  System.out.println(sb.getFees());
          }
          
		}

	}

}

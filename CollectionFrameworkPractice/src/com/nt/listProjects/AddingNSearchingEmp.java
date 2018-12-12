package com.nt.listProjects;

import java.util.ArrayList;

public class AddingNSearchingEmp {

	public static void main(String[] args) {
	
		ArrayList<Object> al=new ArrayList<>();
		
		al.add(new Employee(101, "raja", 1000, "Java"));
		al.add(new Employee(102, "Hari", 2000, "Java"));
		al.add(new Employee(103, "ashok",3000,"WS"));
		
		System.out.println(al.contains(new Employee(101,"raja",1000,"Java")));
		
		System.out.println(al.contains(new Employee(101,"PK",1000,"Java")));
		


	}

}

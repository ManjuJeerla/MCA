package com.nt.listProjects;

public class Employee {
	
	private int eno;
	private String ename;
	private int sal;
	private String dept;

	
	public Employee(int eno, String ename, int sal, String dept) {
	
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.dept = dept;
	}
	
	@Override
	public boolean equals(Object obj) {
	if(obj instanceof Employee) {
		Employee e=(Employee)obj;
		return (this.eno==e.eno)&&(this.dept.equals(e.dept));
	}
	return false;
	}
	


}

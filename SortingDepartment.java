package com.dhanush.java;

import java.util.ArrayList;
import java.util.Collections;

class EmployeeDep implements Comparable<EmployeeDep>{
	private int id;
	private String name;
	private String department;
	private int salary;
	
	public EmployeeDep() {
		
	}
	
	public EmployeeDep(int id,String name,String department,int salary) {
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setDepartment(String dep) {
		this.department=dep;
	}
	
	public void setSalary(int sal) {
		this.salary=sal;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public int getSalary() {
		return this.salary;
	}
	@Override
	public String toString() {
		return id+" "+name+" "+department+" "+salary;
	}
	@Override
	public int compareTo(EmployeeDep e2) {
		EmployeeDep e1=this;
		return e1.department.compareTo(e2.department);
	}
}
public class SortingDepartment {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		EmployeeDep e1=new EmployeeDep(5,"Dhanush","CSE",10000);
		EmployeeDep e2=new EmployeeDep(4,"Remo","IT",50000);
		EmployeeDep e3=new EmployeeDep(1,"RemoDhanush","CS",12000);
		EmployeeDep e4=new EmployeeDep(2,"DhanushRemo","IT",110000);
		EmployeeDep e5=new EmployeeDep(3,"R.Dhanush","IT",21000);
//		System.out.println(e.getId()+"-> "+e.getName()+"-> "+e.getDepartment()+"-> "+e.getSalary());
//		System.out.println(e);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		System.out.println(al);
		System.out.println("SORTING BASED ON THE EMPLOYEE DEPARTMENT");
		Collections.sort(al);
		System.out.println(al);
	}

}

package com.dhanush.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

class EmployeeName implements Comparable<EmployeeName>{
	private int id;
	private String name;
	private String department;
	private int salary;
	
	public EmployeeName() {
		
	}
	
	public EmployeeName(int id,String name,String department,int salary) {
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
	public int compareTo(EmployeeName e2) {
		EmployeeName e1=this;
		String name1=e1.name;
		String name2=e2.name;
		int n=name1.compareTo(name2);
		return n;
		
	}
}
public class SortingName{

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		EmployeeName e1=new EmployeeName(5,"DHANUSH","CSE",10000);
		EmployeeName e2=new EmployeeName(4,"REMO","IT",50000);
		EmployeeName e3=new EmployeeName(1,"NAANU","CS",12000);
		EmployeeName e4=new EmployeeName(2,"REMODHANUSH","IT",110000);
		EmployeeName e5=new EmployeeName(3,"ABHI","IT",21000);
//		System.out.println(e.getId()+"-> "+e.getName()+"-> "+e.getDepartment()+"-> "+e.getSalary());
//		System.out.println(e);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		System.out.println(al);
		System.out.println("SORTING BASED ON THE EMPLOYEE NAME");
		Collections.sort(al);
		System.out.println(al);
		
	}

}

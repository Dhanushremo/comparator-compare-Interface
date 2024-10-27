package com.dhanush.java;

import java.util.ArrayList;
import java.util.Collections;

class EmployeeSalary implements Comparable<EmployeeSalary>{
	private int id;
	private String name;
	private String department;
	private int salary;
	
	public EmployeeSalary() {
		
	}
	
	public EmployeeSalary(int id,String name,String department,int salary) {
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
	public int compareTo(EmployeeSalary e2) {
		EmployeeSalary e1=this;
		Integer sal1=e1.salary;
		Integer sal2=e2.salary;
		return sal1.compareTo(sal2);
	}
}
public class SortingSalary {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		EmployeeSalary e1=new EmployeeSalary(5,"Dhanush","CSE",10000);
		EmployeeSalary e2=new EmployeeSalary(4,"Remo","IT",50000);
		EmployeeSalary e3=new EmployeeSalary(1,"RemoDhanush","CS",1200);
		EmployeeSalary e4=new EmployeeSalary(2,"DhanushRemo","IT",110000);
		EmployeeSalary e5=new EmployeeSalary(3,"R.Dhanush","IT",210);
//		System.out.println(e.getId()+"-> "+e.getName()+"-> "+e.getDepartment()+"-> "+e.getSalary());
//		System.out.println(e);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		System.out.println(al);
		System.out.println("SORTING BASED ON THE EMPLOYEE SALARY");
		Collections.sort(al);
		System.out.println(al);
	}

}

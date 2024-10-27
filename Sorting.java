package com.dhanush.java;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private String department;
	private int salary;
	
	public Employee() {
		
	}
	
	public Employee(int id,String name,String department,int salary) {
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
	public int compareTo(Employee e2) {
		Employee e1=this;
		Integer id1=e1.id;
		Integer id2=e2.id;
		return id1.compareTo(id2);
	}
}
public class Sorting {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		Employee e1=new Employee(5,"Dhanush","CSE",10000);
		Employee e2=new Employee(4,"Remo","IT",50000);
		Employee e3=new Employee(1,"RemoDhanush","CS",12000);
		Employee e4=new Employee(2,"DhanushRemo","IT",110000);
		Employee e5=new Employee(3,"R.Dhanush","IT",21000);
//		System.out.println(e.getId()+"-> "+e.getName()+"-> "+e.getDepartment()+"-> "+e.getSalary());
//		System.out.println(e);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		System.out.println(al);
		System.out.println("SORTING BASED ON THE EMPLOYEE ID");
		Collections.sort(al);
		System.out.println(al);
	}

}

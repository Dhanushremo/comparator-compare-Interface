
package com.dhanush.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
class Demo implements Comparator<Employee_Comparator>{
	@Override
	public int compare(Employee_Comparator o1, Employee_Comparator o2) {
		Integer id1=o1.getId();
		Integer id2=o2.getId();
		return id1.compareTo(id2);
	}
}
class Employee_Comparator{
	private int id;
	private String name;
	private String department;
	private int salary;
	
	public Employee_Comparator() {
		
	}
	
	public Employee_Comparator(int id,String name,String department,int salary) {
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
	
}
public class SortingCompareMethod{

	public static void main(String[] args) {
		Demo d=new Demo();
		TreeSet al=new TreeSet(d);
		
		Employee_Comparator e1=new Employee_Comparator(5,"Dhanush","CSE",10000);
		Employee_Comparator e2=new Employee_Comparator(4,"Remo","IT",50000);
		Employee_Comparator e3=new Employee_Comparator(1,"RemoDhanush","CS",12000);
		Employee_Comparator e4=new Employee_Comparator(2,"DhanushRemo","IT",110000);
		Employee_Comparator e5=new Employee_Comparator(3,"R.Dhanush","IT",21000);
//		System.out.println(e.getId()+"-> "+e.getName()+"-> "+e.getDepartment()+"-> "+e.getSalary());
//		System.out.println(e);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		System.out.println("SORTING BASED ON THE EMPLOYEE ID");
		System.out.println(al);
	}

}

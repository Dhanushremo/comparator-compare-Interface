
package com.dhanush.java;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class EmployeeUser implements Comparable<EmployeeUser>{
	private int id;
	private String name;
	private String department;
	private int salary;
	
	public EmployeeUser() {
		
	}
	
	public EmployeeUser(int id,String name,String department,int salary) {
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
	public int compareTo(EmployeeUser e2) {
		EmployeeUser e1=this;
		Integer id1=e1.id;
		Integer id2=e2.id;
		return id1.compareTo(id2);
	}
}
public class SortingUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
		System.out.println("Enter the No.of EMPLOYEE's");
		int n=sc.nextInt();
		int i=1;
		while(n!=0){
			EmployeeUser e=new EmployeeUser();
			System.out.println("Enter the details of "+(i++)+" EMPLOYEE!!");
			System.out.println("1)ID 2)NAME 3)DEPARTMENT 4)SALARY");
			String s=sc.next();
			String[] arr=s.split(",");
			e.setId(Integer.parseInt(arr[0]));
			e.setName(arr[1]);
			e.setDepartment(arr[2]);
			e.setSalary(Integer.parseInt(arr[3]));
			
			al.add(e);
			n--;
		}
		System.out.println(al);
		System.out.println("SORTING BASED ON THE EMPLOYEE ID");
		Collections.sort(al);
		System.out.println(al);
	}

}


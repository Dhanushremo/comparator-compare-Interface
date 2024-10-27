
package com.dhanush.java;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;

class EmployeeUser1 implements Comparable<EmployeeUser1>{
	private int id;
	private String name;
	private String email;
	private String department;
	private int salary;
	
	public EmployeeUser1() {
		
	}
	
	public EmployeeUser1(int id,String name,String email,String department,int salary) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.department=department;
		this.salary=salary;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
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
	public int compareTo(EmployeeUser1 e2) {
		EmployeeUser1 e1=this;
		
		String name1=e1.name;
		String name2=e2.name;
		if(name1.equals(name2)) {
			Integer id1=e1.id;
			Integer id2=e2.id;
			return id1.compareTo(id2);
		}
		return name1.compareTo(name2);
	}
}
public class SortingTreeset {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet ts=new TreeSet();
		System.out.println("Enter the number of employess");
		int n=sc.nextInt();
		int i=1;
		while(n!=0){
			EmployeeUser1 e=new EmployeeUser1();
			System.out.println("Enter the details of "+ (i++) +" EMPLOYEE!!");
			System.out.println("1)ID 2)NAME 3)EMAIL 4)DEPARTMENT 5)SALARY");
			String s=sc.next();
			String[] arr=s.split(",");
			e.setId(Integer.parseInt(arr[0]));
			e.setName(arr[1]);
			e.setEmail(arr[2]);
			e.setDepartment(arr[3]);
			e.setSalary(Integer.parseInt(arr[4]));
			
			ts.add(e);
			n--;
		}
		System.out.println("SORTING BASED ON THE EMPLOYEE NAME,if NAME IS equal we are sorting based on ID's");
		System.out.println(ts);
	
		
	}

}


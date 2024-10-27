
package com.dhanush.java;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
class Demo01 implements Comparator<Employeeee1>{
	@Override
	public int compare(Employeeee1 e1, Employeeee1 e2) {
		Integer id1=e1.getId();
		Integer id2=e2.getId();
		if(id1==id2) {
			return e1.getName().compareTo(e2.getName());
		}
		return 1 * id1.compareTo(id2);
	}
}
class Demo011 implements Comparator<Employeeee1>{
	@Override
	public int compare(Employeeee1 e1, Employeeee1 e2) {
		Integer id1=e1.getId();
		Integer id2=e2.getId();
		if(id1==id2) {
			return e1.getName().compareTo(e2.getName());
		}
		return -1 * id1.compareTo(id2);
	}
}
class Demo02 implements Comparator<Employeeee1>{
	@Override
	public int compare(Employeeee1 e1, Employeeee1 e2) {
		
		return e1.getName().compareTo(e2.getName());
	}
}
class Demo03 implements Comparator<Employeeee1>{
	@Override
	public int compare(Employeeee1 e1, Employeeee1 e2) {
		return e1.getDepartment().compareTo(e2.getDepartment());
	}
}
class Demo04 implements Comparator<Employeeee1>{
	@Override
	public int compare(Employeeee1 e1, Employeeee1 e2) {
		Integer sal1=e1.getSalary();
		Integer sal2=e2.getSalary();
		return sal1.compareTo(sal2);
	}
}
class Employeeee1{
	private int id;
	private String name;
	private String department;
	private int salary;
	
	public Employeeee1() {
		
	}
	
	public Employeeee1(int id,String name,String department,int salary) {
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
public class SortingDesendingOrderComparator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Demo01 d1=new Demo01();
		Demo011 d11=new Demo011();
		Demo02 d2=new Demo02();
		Demo03 d3=new Demo03();
		Demo04 d4=new Demo04();
		TreeSet<Employeeee1> ts=null;
		System.out.println("Sort Based On?");
		System.out.println(" 1.ID(Low-High) \n 2.ID(High-Low) \n 3.NAME \n 4.DEPARTMENT \n 5.SALARY");
		System.out.println("Enter the option here");
		int option=sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("Sorting Based on the ID(LOW-HIGH)");
			ts=new TreeSet<Employeeee1>(d1);
			break;
		case 2:
			System.out.println("Sorting Based on the ID(HIGH-LOW)");
			ts=new TreeSet<Employeeee1>(d11);
			break;
		case 3:
			System.out.println("Sorting Based on the Name");
			ts=new TreeSet<Employeeee1>(d2);
			break;
		case 4:
			System.out.println("Sorting Based on the Department");
			ts=new TreeSet<Employeeee1>(d3);
			break;
		case 5:
			System.out.println("Sorting Based on the Salary");
			ts=new TreeSet<Employeeee1>(d4);
			break;
		default:
			System.out.println("Invalid Input!!");
			break;
		}
		System.out.println("Enter The No.of Employee's");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			Employeeee1 e=new Employeeee1();
			System.out.println("Enter the Employee Details");
			System.out.println("1->ID 2->NAME 3->DEPARTMENT 4->SALARY");
			String s=sc.next();
			String[] s1=s.split(",");
			e.setId(Integer.parseInt(s1[0]));
			e.setName(s1[1]);
			e.setDepartment(s1[2]);
			e.setSalary(Integer.parseInt(s1[3]));		
			
			ts.add(e);
			
		}
		
		System.out.println(ts);
	
		
		
	

		
	}

}


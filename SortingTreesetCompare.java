
package com.dhanush.java;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
class Demo1 implements Comparator<Employeee>{
	@Override
	public int compare(Employeee e1, Employeee e2) {
		Integer id1=e1.getId();
		Integer id2=e2.getId();
		if(id1==id2) {
			return e1.getName().compareTo(e2.getName());
		}
		return id1.compareTo(id2);
	}
}
class Demo2 implements Comparator<Employeee>{
	@Override
	public int compare(Employeee e1, Employeee e2) {
		
		return e1.getName().compareTo(e2.getName());
	}
}
class Demo3 implements Comparator<Employeee>{
	@Override
	public int compare(Employeee e1, Employeee e2) {
		return e1.getDepartment().compareTo(e2.getDepartment());
	}
}
class Demo4 implements Comparator<Employeee>{
	@Override
	public int compare(Employeee e1, Employeee e2) {
		Integer sal1=e1.getSalary();
		Integer sal2=e2.getSalary();
		return sal1.compareTo(sal2);
	}
}
class Employeee{
	private int id;
	private String name;
	private String department;
	private int salary;
	
	public Employeee() {
		
	}
	
	public Employeee(int id,String name,String department,int salary) {
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
public class SortingTreesetCompare {

	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		Demo2 d2=new Demo2();
		Demo3 d3=new Demo3();
		Demo4 d4=new Demo4();
		Scanner sc=new Scanner(System.in);
		TreeSet ts1=new TreeSet(d1);
		TreeSet ts2=new TreeSet(d2);
		TreeSet ts3=new TreeSet(d3);
		TreeSet ts4=new TreeSet(d4);
		System.out.println("Enter The No.of Employee's");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			Employeee e=new Employeee();
			System.out.println("Enter the Employee Details");
			System.out.println("1->ID 2->NAME 3->DEPARTMENT 4->SALARY");
			String s=sc.next();
			String[] s1=s.split(",");
			e.setId(Integer.parseInt(s1[0]));
			e.setName(s1[1]);
			e.setDepartment(s1[2]);
			e.setSalary(Integer.parseInt(s1[3]));		
			ts1.add(e);
			ts2.add(e);
			ts3.add(e);
			ts4.add(e);
			
		}
		System.out.println("Sort Based On?");
		System.out.println(" 1.ID \n 2.NAME \n 3.DEPARTMENT \n 4.SALARY");
		System.out.println("Enter the option here");
		int n1=sc.nextInt();
		switch(n1) {
		case 1:
//			ts1.add(e);
			System.out.println(ts1);
			break;
		case 2:
//			ts2.add(e);
			System.out.println(ts2);
			break;
		case 3:
//			ts2.add(e);
			System.out.println(ts3);
			break;
		case 4:
//			ts2.add(e);
			System.out.println(ts4);
			break;
		default:
			System.out.println("Error!!");
			break;
		}
		
		
	

		
	}

}

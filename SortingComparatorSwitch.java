
package com.dhanush.java;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
class Demo11 implements Comparator<Employeeee>{
	@Override
	public int compare(Employeeee e1, Employeeee e2) {
		Integer id1=e1.getId();
		Integer id2=e2.getId();
		if(id1==id2) {
			return e1.getName().compareTo(e2.getName());
		}
		return id1.compareTo(id2);
	}
}
class Demo22 implements Comparator<Employeeee>{
	@Override
	public int compare(Employeeee e1, Employeeee e2) {
		
		return e1.getName().compareTo(e2.getName());
	}
}
class Demo33 implements Comparator<Employeeee>{
	@Override
	public int compare(Employeeee e1, Employeeee e2) {
		return e1.getDepartment().compareTo(e2.getDepartment());
	}
}
class Demo44 implements Comparator<Employeeee>{
	@Override
	public int compare(Employeeee e1, Employeeee e2) {
		Integer sal1=e1.getSalary();
		Integer sal2=e2.getSalary();
		return sal1.compareTo(sal2);
	}
}
class Employeeee{
	private int id;
	private String name;
	private String department;
	private int salary;
	
	public Employeeee() {
		
	}
	
	public Employeeee(int id,String name,String department,int salary) {
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
public class SortingComparatorSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Demo11 d1=new Demo11();
		Demo22 d2=new Demo22();
		Demo33 d3=new Demo33();
		Demo44 d4=new Demo44();
		TreeSet<Employeeee> ts=null;
		System.out.println("Sort Based On?");
		System.out.println(" 1.ID \n 2.NAME \n 3.DEPARTMENT \n 4.SALARY");
		System.out.println("Enter the option here");
		int option=sc.nextInt();
		switch(option) {
		case 1:
			ts=new TreeSet<Employeeee>(d1);
			break;
		case 2:
			ts=new TreeSet<Employeeee>(d2);
			break;
		case 3:
			ts=new TreeSet<Employeeee>(d3);
			break;
		case 4:
			ts=new TreeSet<Employeeee>(d4);
			break;
		default:
			System.out.println("Invalid Input!!");
			break;
		}
		System.out.println("Enter The No.of Employee's");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			Employeeee e=new Employeeee();
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


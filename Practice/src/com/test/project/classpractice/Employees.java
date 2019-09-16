package com.test.project.classpractice;
public class Employees {
	String name;
	String address;
	int emp_no;
	int salary;
	String position;
	String gender;
	
	Employees(String n,String a,String p,String g,int en,int s){ // Parameterized constructor
		this.name=n;
		this.address=a;
		this.emp_no=en;
		this.salary=s;
		this.position=p;
		this.gender=g;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(address);
		System.out.println(emp_no);
		System.out.println(salary);
		System.out.println(position);
		System.out.println( gender);
		
	}

	public static void main(String[] args) {
System.out.println("Enter the details of employee"); 
Employees e1=new Employees("pavan","banglore","manager","male", 001, 500000); // creating an object for class Employees
Employees e2=new Employees("soni","chennai","HR","female", 002, 250000);
Employees e3=new Employees("sai","banglore","TL","male", 003, 200000);
Employees E=new Employees("jack","Hyderabad","PROGRAMMER","male", 004, 100000);
e1.display();
e2.display();
e3.display();
E.display();
	}
}
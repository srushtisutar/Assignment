//Kaushik Padwal
package com.EmpProject;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpMain 
{

	public static void main(String[] args) 
	{	
		///Configuration
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sf=cfg.buildSessionFactory();  // build session factory
		Session ss=sf.openSession();  // open session
		Transaction t=ss.beginTransaction(); //  start transaction
		Employee emp=new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee Id :"); // set Id
		int id=sc.nextInt();
		emp.setEid(id);
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Employee Name :");// set name
		String name=sc1.nextLine();
		emp.setEname(name);
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the Employee Deparment :");// set Employee
		String dept=sc2.nextLine();
		emp.setEdept(dept);
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter the Employee Salary :"); //set salary
		int salary=sc3.nextInt();
		emp.setEsalary(salary);
		
		Address ad=new Address();
		Scanner sc4=new Scanner(System.in);
		System.out.println("Enter the Employee Home Name :");// set home name
		String home=sc4.nextLine();
		ad.setHname(home);
		
		Scanner sc5=new Scanner(System.in);
		System.out.println("Enter the Employee Area :"); // set area
		String area=sc5.nextLine();
		ad.setArea(area);
		
		Scanner sc6=new Scanner(System.in);
		System.out.println("Enter the Employee City :");// set city
		String city=sc6.nextLine();
		ad.setCity(city);
		
		Scanner sc7=new Scanner(System.in);
		System.out.println("Enter the Employee Pincode :"); // set pincode
		int pin=sc7.nextInt();
		ad.setPincode(pin);
		
		emp.setAddress(ad);
		ss.save(emp); // save session
		t.commit(); // commit transaction
		

	}

}

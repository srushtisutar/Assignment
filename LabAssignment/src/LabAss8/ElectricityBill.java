package LabAss8;

import java.util.Scanner;

public class ElectricityBill 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); // Scanner class 
		System.out.println("Enter the units :");
		int unit = 0;
		double TotalCharges;
		unit=sc.nextInt(); // take input from user
		
		if(unit>0 && unit <=100)  //using if else statement 
		{
			TotalCharges=unit*1.20;
			System.out.println("your Electricity bill is :"+TotalCharges +".Rs");
		}
		else if(unit>100 && unit <=300) 
		{
			TotalCharges=unit*2.0;
			System.out.println("your Electricity bill is :"+TotalCharges +".Rs");
		}
		else if(unit>300) 
		{
			TotalCharges=unit*3.0;
			System.out.println("your Electricity bill is :"+TotalCharges +".Rs");
		}
		else 
		{
			System.out.println("Invalid input");
		}
	}

}

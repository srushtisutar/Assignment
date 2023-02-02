package LabAss;

import java.util.Scanner;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("enter the number:");
			
			Scanner sc = new Scanner (System.in);
			int n = sc.nextInt();
			 /*1
			   12
			   121
			   12321
			  */
		
			for(int i=1; i<=n;i++) // i= row
			{
				for(int j=1; j<=i;j++) //j=column
				{
					System.out.print(j);  //j=column
				}for(int j=i-1; j>=1;j--) //j=column
				{
					System.out.print(j);  //j=column
				}
				
			System.out.println();
		
		}

	}

}

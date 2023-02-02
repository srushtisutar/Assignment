package LabAss8;
import java.util.Scanner;
public class CalPassInFlight {

	public static void main(String[] args)
	{
		System.out.println("Enter the no of Rows ");
		Scanner sc =new Scanner(System.in); // Scanner class
		
		int r= sc.nextInt(); // take input from user
		boolean flag=true;
		int sum=0;
		
		if(r<0)  // use if else statement
		{
			System.out.println("invalid input");
		}
		else 
		{
			for( int i=0;i<r;i++)  // for loop
			{
				int peopleperr=sc.nextInt();
				if(peopleperr<0) 
				{
					System.out.println("invalid");
					flag =false;
					break;
				}
				else 
				{
					sum+=peopleperr;
					System.out.println(peopleperr);
				}
				
			}
			if(flag==true)
			System.out.println("total no of passanger in aircraft "+sum);
		}
		
		
	}

}


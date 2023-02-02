package LabAss;

import java.util.Scanner;

public class TrianglePrize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("enter the roll no");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a+b+c==180 && a==90||b==90||c==90)
		{
			System.out.println("2nd Prize");
		}
		else if (a+b+c==180 && a==b&&c==a)
		{
		
			System.out.println("3rd Prize");
		}
		else if(a+b+c==180)
				
			{
				System.out.println("1st Prize");
			}

	}

}

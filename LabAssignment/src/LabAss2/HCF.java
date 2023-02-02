package LabAss2;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Highest common factor .. ex 60-> 2 3 4 6 10 12 
		// 36-> 2 3 4 6 12 
		// hcf = 12
		int a = 60;
		int b = 36;
		int  hcf = 0;

		for (int i = 1; i <= a || i <= b; i++) {  // for loop 
			if (a % i == 0 && b % i == 0)  // if statement
				hcf = i;
		}
		System.out.println(hcf);

	}

}

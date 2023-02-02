//Kaushik Padwal
//Assignment 13
//Program 1 :Check weather array is perfect square array or not

package Ass;

public class PerfectSqrArr  // create class
{
	
	private static boolean PerfectSqrArr(int[]arr) //method
	{
		int psq=0,n=0;
		
		for(int i=0;i<arr.length;i++) // for loop
		{
			psq=(int)Math.sqrt(arr[i]); 
			psq=n*n;
			
			if(psq!=arr[i]) // if statement
			{
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) 
	{
		int[]arr= {16,144,169,224}; //given input
		if( PerfectSqrArr(arr))  // use if else statement
		{
			System.out.println("The Array is Perfect Square Array.");
		}
		else 
		{
			System.out.println("The Array is no a Perfect Square Array.");
		}

	}

	

}

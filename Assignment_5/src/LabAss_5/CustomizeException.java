package LabAss_5;

import java.util.ArrayList;
import java.util.List;

public class CustomizeException {

	public static void checError(int num)throws Exception
	{
		//List<Integer> number=new ArrayList<>();
		int arr[]= {};
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==0)
			{
			throw new ZeroMemError ("Zeromember error");
			}
			else 
			{
			System.out.println("you are welcome");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		try 
		{
			checError(4);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}

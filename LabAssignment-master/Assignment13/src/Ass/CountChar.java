// kaushik padwal
// Assignment 13
// program 2:count number of character in given above array and create HashMap <Character,Integer>
//display character and its count
package Ass;

import java.util.HashMap;

public class CountChar //class
{

	public static void main(String[] args)
	{
	char[]arr= {'a','c','d','f','a'};
	
	//create a HashMap to store the char count
	HashMap <Character,Integer>charCounts = new HashMap<>();
	for(char p:arr) // for each loop
	{
		int count=charCounts.getOrDefault(p,0);
		charCounts.put(p, count+1);
	}
		for(char p:charCounts.keySet()) //for each loop
		{
			System.out.println(p+":"+charCounts.get(p));
		}
	}

}

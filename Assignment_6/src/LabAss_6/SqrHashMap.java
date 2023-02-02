package LabAss_6;

import java.util.HashMap;
import java.util.Map;


public class SqrHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashMap
				HashMap<Integer,Integer> sqr =new HashMap<Integer,Integer>();
				sqr.put(1, 1);
				sqr.put(2, 4);
				sqr.put(3, 9);
				sqr.put(4, 16);
				sqr.put(5, 25);
				sqr.put(6, 36);
				sqr.put(7, 49);
				sqr.put(8, 64);
				sqr.put(9, 91);
				sqr.put(10, 100);
				sqr.put(11, 121);
				sqr.put(12, 144);
				sqr.put(13, 169);
				sqr.put(14, 196);
				sqr.put(15, 225);
				
				for(Map.Entry<Integer, Integer>entry:sqr.entrySet())
				{
					System.out.println("Key :"+entry.getKey()+", Value :"+entry.getValue());
				}
				
	}

}

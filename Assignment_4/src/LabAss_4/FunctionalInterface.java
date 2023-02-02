package LabAss_4;
import java.util.ArrayList;
import java.util.List;
//functional interface
interface Addition  // 
{
	public int Adder(int x, int y);
}
public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> name=new ArrayList<String>(); // array list
		name.add("Divya");
		
		name.forEach((m)->  // lambda expression
		{
			System.out.println(m.toUpperCase());  // use UpperCase method
			
		});
		
		Addition a=(n,m)->  // lambda expression
		{
			return n+m;
		};
		
		System.out.println(a.Adder(7, 5));
		
		
	}

}
	

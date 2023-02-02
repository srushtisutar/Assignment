package LabAss5;

public class AccountTest
{
	public static void main(String[] args) 
	{
		Account ac = new Account();
		
		ac.setName("Kaushik");  // set value
		ac.setBalance(45000d);	// set value
		
		System.out.println(ac.getName()); // get value
		System.out.println(ac.getBalance());// get value
		
		ac.withdraw(); // method call
		ac.deposite(); // method call

	}
	
}
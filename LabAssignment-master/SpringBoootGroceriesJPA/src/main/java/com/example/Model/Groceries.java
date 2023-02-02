
//Pogo class
package com.example.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity 
public class Groceries // class
{
	@Id
	private int id;
	private String name;
	private float price;
	private int Quantity;
	
	//Default Constructor
	public Groceries() 
	{
		
	}
	// Parameterized Constructor
	public Groceries(int id, String name, float price, int quantity) 
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		Quantity = quantity;
	}
	
	// Getter Setter Method
	public int getId()
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public float getPrice()
	{
		return price;
	}
	public void setPrice(float price) 
	{
		this.price = price;
	}
	
	public int getQuantity() 
	{
		return Quantity;
	}
	
	public void setQuantity(int quantity)
	{
		Quantity = quantity;
	}
	
	
	
}

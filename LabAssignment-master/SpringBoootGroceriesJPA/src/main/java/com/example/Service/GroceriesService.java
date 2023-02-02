package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Model.Groceries;

// Services .. all methods or CRUD Operation
@Service
public interface GroceriesService 
{
	//Create Or Post Method
	public Groceries createGroceries(Groceries groceries);
	
	//Get Method
	public List <Groceries>findAllGroceries();
	
	//Delete Method
	public void deleteGroceries (int id);
	
	//Update or Put Method
	public Groceries updateGroceries(Groceries groceries);
	
	//Find by id
	public Groceries findGroceriesbyId(int id);
	
	// find by name
	public List <Groceries>findGroceriesByname(String name);

}


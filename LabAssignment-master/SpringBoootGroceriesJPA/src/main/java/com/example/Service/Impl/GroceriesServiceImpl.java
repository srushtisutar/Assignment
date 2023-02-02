package com.example.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Model.Groceries;
import com.example.Repository.GroceriesRepository;
import com.example.Service.GroceriesService;

//implements all service method
@Repository
public class GroceriesServiceImpl implements GroceriesService
{
	@Autowired
	GroceriesRepository groceriesRepository;


	//Implement create method
	public Groceries createGroceries(Groceries groceries) 
	{
		
		return groceriesRepository.save(groceries);
	}

	//Implement Get  Method
	public List<Groceries> findAllGroceries()
	{
		
		return groceriesRepository.findAll();
	}

//Implement Delete Method
	public void deleteGroceries(int id) 
	{
		groceriesRepository.deleteById(id);
		
	}

	//Implement Update Method
	public Groceries updateGroceries(Groceries groceries) 
	{
		Groceries _groceries=groceriesRepository.findById(groceries.getId()).get();
		_groceries.setId(groceries.getId());
		_groceries.setPrice(_groceries.getPrice());
		_groceries.setQuantity(_groceries.getQuantity());
		return groceriesRepository.save(groceries);
	}

	//Implement get method by id
	public Groceries findGroceriesbyId(int id) 
	{
		
		return groceriesRepository.findById(id).get();
	}

	//Implement get method by name
	public List<Groceries> findGroceriesByname(String name)
	{
	
		return groceriesRepository.findGroceriesByname(name);
	}

}

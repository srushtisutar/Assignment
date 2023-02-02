package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Groceries;
import com.example.Service.GroceriesService;

//Controller Class
@RestController
public class GroceriesController 
{
	@Autowired
	GroceriesService groceriesService;
	
	@PostMapping("/groceries")
	public Groceries createGroceries(@RequestBody Groceries groceries) 
	{
		return groceriesService.createGroceries(groceries);
		
	}
	
	
	@GetMapping("/groceries")
	public List<Groceries>findAllGroceries()
	{
		return groceriesService.findAllGroceries() ;
		
	}
	
	
	@GetMapping("/groceries/gro/{name}")
	public List<Groceries>findGroceriesByname(@PathVariable String name)
	{
		return groceriesService.findGroceriesByname(name);
		
	}
	
	
	@GetMapping("/groceries/{id}")
	public Groceries findGroceriesByid(@PathVariable int id)
	{
		return groceriesService.findGroceriesbyId(id);
		
	}
	
	@DeleteMapping("/groceries/{id}")
	public String deleteGroceries(@PathVariable int id)
	{
		 groceriesService.deleteGroceries(id);
		 return "Groceries is Deleted";
		
	}
	
	@PutMapping("/groceries")
	public Groceries updateGroceries(@RequestBody Groceries groceries )
	{
		return groceriesService.updateGroceries(groceries);
		
	}
	


}
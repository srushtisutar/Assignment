package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.Groceries;

//Repository Interface
public interface GroceriesRepository extends JpaRepository<Groceries,Integer>
{
	//Custom Method
	//Groceries find by name
	
	public List <Groceries>findGroceriesByname(String name);
	


}

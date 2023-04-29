package com.pooihern.contactlessOrdering.CafeSystem.drinks;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DrinksController {
	@Autowired
	private DrinksRepo drinksRepo;
	
	public DrinksController(){
		
	}
	
	public DrinksController(DrinksRepo drinksRepo) {
		this.drinksRepo = drinksRepo;
	}
	
	@GetMapping("/drinks")
	public List<DrinksEntity> getAllDrinks() {
		return drinksRepo.findAll();
	}
	
	@PostMapping("/drinks")
	public List<DrinksEntity> getAllDrinks(@RequestBody DrinksEntity newDrink) {
		drinksRepo.save(newDrink);
		return drinksRepo.findAll();
	}
}

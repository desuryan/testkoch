package org.dex.fizzbuzz.controller;

import java.util.List;

import org.dex.fizzbuzz.entity.FizzBuzValue;
import org.dex.fizzbuzz.service.FizzBuzzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzController {
	
	@Autowired
	FizzBuzzService fizzBuzzService;
	
	@GetMapping("/play/{id}")
	/*public ResponseEntity <List<FizzBuzValue>> getResult(@PathVariable (value = "id") Long id)
	{
		return ResponseEntity.ok().body(fizzBuzzService.checkFizzBuzlogic(id));
		
		
	}
	*/
	public List<FizzBuzValue> getResult(@PathVariable long id)
	{
		return fizzBuzzService.checkFizzBuzlogic(id);
		
		
	}

}

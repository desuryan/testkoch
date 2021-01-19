package org.dex.fizzbuzz.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.dex.fizzbuzz.entity.FizzBuzValue;
import org.dex.fizzbuzz.service.FizzBuzzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzController {
	
	@Autowired
	FizzBuzzService fizzBuzzService;
	
	@GetMapping("/play")
	public ResponseEntity <List<FizzBuzValue>> getResult( @RequestParam int start,@RequestParam int stop)
	{
		return ResponseEntity.ok().body( fizzBuzzService.checkFizzBuzlogic(start,stop));
		
		
	}
	

}

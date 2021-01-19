package org.dex.fizzbuzz.service;

import java.util.ArrayList;
import java.util.List;

import org.dex.fizzbuzz.entity.FizzBuzValue;
import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

	public List<FizzBuzValue> checkFizzBuzlogic(Long digit)
	{
		
		List<FizzBuzValue> resultList = new ArrayList<>();
		
		System.out.println("11111111111111111111");
		String str =  (digit/3 == 0) ? ( digit/5 == 0 ? "fizzbuzz" : "fizz") : (digit/5 ==0 ? "buzz" : digit.toString());
		
		FizzBuzValue fizzBuzzValue = new FizzBuzValue();
		fizzBuzzValue.setIn(digit);
		fizzBuzzValue.setResult(str);
		
		System.out.println("222222222222222222");
		resultList.add(fizzBuzzValue);
		
		return resultList;
	}
	
}

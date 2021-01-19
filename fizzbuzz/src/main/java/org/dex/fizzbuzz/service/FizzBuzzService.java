package org.dex.fizzbuzz.service;

import java.util.ArrayList;
import java.util.List;

import org.dex.fizzbuzz.entity.FizzBuzValue;
import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

	public List<FizzBuzValue> checkFizzBuzlogic(int start, int stop)
	{
		List<FizzBuzValue> resultList = new ArrayList<>();
		for(int i=start; i<stop;i++)
		{
		//System.out.println("11111111111111111111");
		String str =  (i%3 == 0) ? ( i%5 == 0 ? "fizzbuzz" : "fizz") : (i%5 ==0 ? "buzz" : Integer.toString(i));
		
		FizzBuzValue fizzBuzzValue = new FizzBuzValue();
		fizzBuzzValue.setIn(i);
		fizzBuzzValue.setResult(str);
		
		//System.out.println("222222222222222222");
		resultList.add(fizzBuzzValue);
		}
		return resultList;
	}
	
}

package org.dex.fizzbuzz.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Range;

import lombok.Data;

@Data
public class FizzBuzValue {
	
   
	
	public int in;
	
	public String result;

}

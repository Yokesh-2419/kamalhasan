package com.example.JavaFsd48;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/Intial")
@Service
public class Intialize {
	
	
	
	
	public int add(int a, int b) {
		System.out.println("THE ADDITIION OF TWO NUMBERS IS"+(a+b));
		return a+b;
	}

	public int sub(int a, int b)
	{
		System.out.println("THE SUBRACTION OF TWO NUMBERS IS"+(b-a));
		return b-a;
	}
	
	public int mul(int a, int b)
	{
		System.out.println("THE MULTIPLICATION OF TWO NUMBERS IS"+(a*b));
		return a*b;
	}
	
	public int div(int a, int b)
	{
		System.out.println("THE DIVISON  OF TWO NUMBERS IS"+(b/a));
		return b/a;
	}

	
	
	

}

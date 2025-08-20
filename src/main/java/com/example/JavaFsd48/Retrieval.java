package com.example.JavaFsd48;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;





@RequestMapping("/acp")
@Controller
public class Retrieval {
	@Autowired
   Intialize intial;
	
	
	
	@RequestMapping(value="/Addition",method=RequestMethod.GET)
	@ResponseBody
	public int Addition()
	{
		return intial.add(10,25);
		
	}
	@RequestMapping(value="/subraction",method=RequestMethod.GET)
	@ResponseBody
	public int subraction()
	{
		return intial.sub(35,25);
	
	}
	@RequestMapping(value="/multiplication",method=RequestMethod.GET)
	@ResponseBody
	public int multiplication()
	{
		return intial.mul(10,20);
	
	}
	@RequestMapping(value="/divison",method=RequestMethod.GET)
	@ResponseBody
	public int divison()
	{
		return intial.div(90,30);
	
	}
	
	

}

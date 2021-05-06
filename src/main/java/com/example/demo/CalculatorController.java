package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class CalculatorController {

	
	  @GetMapping("/getadd/{a}/{b}")
	  public static int add(@PathVariable int a,@PathVariable int b)
	  {
		  return a+b;
	  }
	  
	  @GetMapping("/getsub/{a}/{b}")
	  public static int sub(@PathVariable int a,@PathVariable int b)
	  {
		  return a-b;
	  }
	  
	  @GetMapping("/getmul/{a}/{b}")
	  public static int mul(@PathVariable int a,@PathVariable int b)
	  {
		  return a*b;
	  }
	
	  @GetMapping("/getdiv/{a}/{b}")
	  public static double div(@PathVariable double a,@PathVariable double b)
	  {
		  if(b!=0)
		  {
			  
			  return a/b;
		  }
		  else
		  {
			  System.out.println("Invalid number");
			  return -1;
		  }
	  }
	  
	  @GetMapping("/getsquare/{a}")
	  public int square(@PathVariable int a)
	  {
		  return a*a;
	  }
	  
	  @GetMapping("/getcube/{a}")
	  public int cube(@PathVariable int a)
	  {
		  return a*a*a;
	  }
}

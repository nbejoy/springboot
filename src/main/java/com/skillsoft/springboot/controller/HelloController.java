package com.skillsoft.springboot.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController 
{
     @RequestMapping (value = "/", method= RequestMethod.GET)
     public String index()
     {
    	 
    	 return "This is the main page War ";
     }
     
     @RequestMapping (value = "/welcome", method= RequestMethod.GET)
     public String welcome()
     {
    	 
    	 return "Welcome to spring boot!!! (War)";
     }
     @RequestMapping (value = "/hello", method= RequestMethod.GET)
     public String hello()
     {
    	 
    	 return "Hello Spring Boot!!! (War)";
     }
     
}

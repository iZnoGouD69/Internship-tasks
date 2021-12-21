package com.example.misc;


public class GenericExample {
	
	
	public static void main(String[] args) {
		
		GenericClass<Integer> intObj = new GenericClass<Integer>(10);
		GenericClass<String> strObj = new GenericClass<String>("Ten");
		
		System.out.println(intObj.getObject());
		System.out.println(strObj.getObject());
		
	}
	
	
}

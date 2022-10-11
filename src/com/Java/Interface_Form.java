package com.Java;


public interface Interface_Form { // Fully abstraction/interface

	void sports();

	static int a = 100; // Static Variable

	static void sum() { // we can create static variable in interface
		System.out.println(a); 
	}

	public static void main(String[] args) {
		
		
		Interface_Form c = new Application_Form(); // Up casting - Interface
		
		c.sports(); // Access child class method in parent class

		sum(); // without using object we can invoke static method
	}
}

package com.Java;

public abstract class AbstractClass_Form { // abstract class/Partial abstraction

	public abstract void subject1(); // Abstract Method

	public void subject2() { // Non - Abstract method
		System.out.println("English-1");
	}

	static int x = 100; // Static variable

	public static void add() { //  we can create static variable in Abstract class
		System.out.println(x);

	}
	
	public static void main(String[] args) {
		AbstractClass_Form b = new Application_Form(); // Up casting - Abstract Class
		b.subject1();
		b.subject2(); // Access Child class method in parent class
		add(); // without creating object we can invoke static method
	
	}
}
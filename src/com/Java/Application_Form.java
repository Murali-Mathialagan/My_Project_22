package com.Java;


public class Application_Form extends AbstractClass_Form implements Interface_Form {

	long a; // class variable - inside the class and outside the method

	static short s = 300; // static Variable

	final byte c = -128; // final variable

	public void employee_Joining_Form() { // signature part
		System.out.println("EMPLOYEE DETAILS"); // implementation part
	}

	public void employee_Name(String name) { // Non-Primitive datatypes
		System.out.println("Employee Name: " + name);
	}

	public void employee_Id(char id) {
		System.out.println("Employee Id: " + id);
	}

	public void date_OF_Birth(String dob) {
		System.out.println("Employee DOB: " + dob); // using concatenation
	}

	public void age(int age) {
		System.out.println("Employee Age: " + age);
	}

	public void phone_Number(long phn) { // Primitive datatypes
		System.out.println("Phone Number:" + phn);
	}

	public void gender() {
		System.out.println("Gender: Male");
	}

	public void studies(String ug) { // Method overloading
		System.out.println("UG: " + ug);
	}

	public void studies() { // same method name but different arguments or parameters
		System.out.println("PG: Bussiness Application");
	}

	public void extra_Skill() {
		System.out.println("Skill: Java");
	}

	@Override
	public void subject1() {
		System.out.println("Tamil"); // Partial Abstraction / Abstract Class
	}

	@Override
	public void subject2() {
		super.subject2(); // Partial Abstraction - supports abstract class and Non-Abstract Class
		System.out.println("English-2");
	}

	@Override
	public void sports() {
		System.out.println("Volley Ball");
	}

	public void m1() {
		int a = 100; // initialization
		a = 150; // local variable value can be changed.
		System.out.println("local variable: " + a);
	}

	public void m2() {
		a = 200;
		System.out.println("Class Variable: " + a); // Class Variable
	}

	public void m3() {
		System.out.println("Static variable: " + s);
	}

	public void m4() {
		System.out.println("Final variable: " + c);
	}

	public static void main(String[] args) {

		Application_Form a = new Application_Form(); // object creation syntax
		

		a.employee_Joining_Form(); // Invoke objects (object name.method name();

		a.employee_Name("Murali.M"); // String - value should be given inside the double quotes

		a.employee_Id('4'); // char- single value should be given inside the single quotes

		a.date_OF_Birth("25-03-1997");

		a.age(25); // int value given as it is

		a.phone_Number(7708324140L); // long - mention L after the value

		a.gender();

		a.studies("Automobile engineering");

		a.studies();

		a.extra_Skill();

		a.m1(); // Local Variable

		a.m2(); // To invoke class method

		System.out.println(a.a); // To invoke class variable

		a.m3(); // To call static method

		System.out.println(Application_Form.s); // To call static variable

		a.m4(); // To call final method

		System.out.println(a.c); // To call final variable

		byte c2 = a.c; // Return type for final

		System.out.println(c2 + 150); // return type

		// Type Casting
		byte by = 127;
		short s = by;
		int i = s;
		long l = i;
		System.out.println("value of long: " + l); // widening

		int in = (int) l;
		short so = (short) in;
		System.out.println("value of short: " + so); // Narrowing

	}

}

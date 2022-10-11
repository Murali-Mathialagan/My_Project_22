package com.Java;

public class Class_Form extends Application_Form {

	@Override // Annotation
	public void studies() { // Method over riding
		super.studies(); // keyword super - access the parent class method as it is
		System.out.println("Human Resources"); // customized implementation part
	}

	public static void main(String[] args) {

		Class_Form a = new Class_Form();
		a.studies();
		a.studies("Automobile Engineering");
	}
}

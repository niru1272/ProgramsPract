package com.niranjan.firstproject;

public class EncapsulationExample extends Person {

	public static void main(String[] args) {

		Person obj = new Person();
//		obj.setName("Niranjan");
		obj.name="Niranjan";
//		obj.Name();
		System.out.println(obj.getName());
		
		Person nir = new Person();
		System.out.println(nir.getName());
	}

}

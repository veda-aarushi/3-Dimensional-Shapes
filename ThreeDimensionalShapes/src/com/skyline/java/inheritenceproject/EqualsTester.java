package com.skyline.java.inheritenceproject;

public class EqualsTester {
	
	public static void main(String[] args) {
		Cube test1 = new Cube();
		Cube test2 = new Cube();
		//this shows == only works for primitive data types
		//looks for addresses
		if (test1.equals(test2)) {
			System.out.println("EQUALS");
		}
		else {
			System.out.println("NOT EQUALS");
		}
		
		String testStr1 = "hello";
		String testStr2 = "hellodasdads";
		testStr2 = "hello";

		if (testStr1 == testStr2) {
			System.out.println("STR: EQUALS");
		}
		else {
			System.out.println("STR: NOT EQUALS");
		}
	}

}

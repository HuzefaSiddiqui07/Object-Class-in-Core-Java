// It compare the given object to this object

package com.objectclass.booleanequals;

public class BooleanEquals01 {
	
	// Declare
	
	int myAge;
	
	String myName;

	public static void main(String[] args) {
		
		// Create an Object 01
		
		BooleanEquals01 equal1 = new BooleanEquals01();
		
		equal1.myAge = 23;
		
		equal1.myName = "Huzefa Siddiqui";
		
		// Create an Object 02
		
		BooleanEquals01 equal2 = new BooleanEquals01();
				
			equal2.myAge = 23;
				
			equal2.myName = "Huzefa Siddiqui";
			
			// Compare 02 Objects by Sys.out
			
			System.out.println(equal1.equals(equal2));

	}

}

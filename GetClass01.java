// This class is used to get the metadata of class

package com.objectclass.getclass;

//import java.util.Scanner;

public class GetClass01 {
//	
//	// Create a method 
//	public int addition (int x , int y) {
//		int add = x+y;
//		return add;
//	}

	public static void main(String[] args) {
		
//		// Create Scanner Object
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter 1st no :");
//		int store1 = scan.nextInt();
//		System.out.println("Enter 2nd no :");
//		int store2 = scan.nextInt();
//		
//		System.out.println(store1);
//		System.out.println(store2);
		
		
		// Create an Object
		
		GetClass01 obj = new GetClass01();
		
//		int result = obj.addition(store1, store2);
//		System.out.println("Add is :" + result);
		
		System.out.println(obj.getClass().getName()); // Print Class Name With Package Name
		
		System.out.println(obj.getClass().getSimpleName()); // Print Only Class Name
		
		System.out.println(obj.getClass().getPackage()); // Class Name With Package Name With Package Name
		
		System.out.println(obj.getClass().getCanonicalName()); // Print Class Name With Package Name
		
		
		

	}

}

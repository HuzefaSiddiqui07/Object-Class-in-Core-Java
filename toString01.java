// It returns the string representation of this object

package com.objectclass.tostring;

public class toString01 {
	
	String myName;

	@Override
	public String toString() {
		return "toString01 [myName = " + myName + "]";
	}

	public static void main(String[] args) {
		
		// Create an Object
		
		toString01 obj = new toString01();
		
		obj.myName = "Huzefa Siddiqui";
		
		System.out.println("Object data is : " + obj);
	}

}

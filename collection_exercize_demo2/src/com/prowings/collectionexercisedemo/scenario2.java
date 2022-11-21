package com.prowings.collectionexercisedemo;

public class scenario2 {
public static void main(String[] args) {
	try {
		
		int res=50/0;
	}
	catch ( Exception e) {
		System.out.println(e);
		System.out.println("rest of the code");
	}
}
}

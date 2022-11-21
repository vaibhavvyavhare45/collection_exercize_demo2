package com.prowings.collectionexercisedemo;

public class Scenario1 {
	public static void main(String[] args) {
	
		try {
			System.out.println("main is started...");
		
			int res=10/1;
			
			System.out.println("****");
			
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException e");
			
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException");
			
		}
		catch(Exception e) {
			System.out.println("catch block handle");
			
		}
		finally {
			System.out.println("finaly is executed...");
		}
		System.out.println("main is ended...");
	}

}

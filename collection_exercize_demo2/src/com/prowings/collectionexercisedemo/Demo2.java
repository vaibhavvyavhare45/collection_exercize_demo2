package com.prowings.collectionexercisedemo;

import java.util.*;

public class Demo2 {
	public static void main(String[] args) {
		
		HashMap h=new HashMap();
		h.put("A",10);
		h.put("B", 20);
		h.put("C", 30);
		System.out.println("Before => "+h);
		
		Set <Map.Entry<String,Integer>> s=h.entrySet();
		LinkedHashMap h1=new LinkedHashMap();
		for (Map.Entry<String, Integer> x:s) 
			h1.put(x.getValue(), x.getKey());
		
		System.out.println("After => "+h1);
	}

}

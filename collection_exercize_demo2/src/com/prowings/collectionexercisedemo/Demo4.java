package com.prowings.collectionexercisedemo;

import java.util.*;
import java.util.Map.Entry;
//import java.util.Map.Entry;

public class Demo4 {
	public static void main(String[] args) {
		

		ArrayList<ArrayList> al = new ArrayList<>();

		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		ArrayList<Integer> al3 = new ArrayList<>();

		Integer a1[] = { 1, 2, 4, 10 };
		Integer a2[] = { 3, 2, 5, 10 };
		Integer a3[] = { 2, 7, 6, 10 };
		for (int i = 0; i < a1.length; i++) {
			al1.add(a1[i]);
			al2.add(a2[i]);
			al3.add(a3[i]);

		}

		al.add(al1);
		al.add(al2);
		al.add(al3);
		System.out.println(al);
		
		HashMap<String,ArrayList> hm=new HashMap<>();
		hm.put("A",al1 );
		hm.put("B",al2 );
		hm.put("C",al3 );
		System.out.println(hm);
		Set<Map.Entry<String,ArrayList>> s=hm.entrySet();
		Iterator <Map.Entry<String,ArrayList>>i1=s.iterator();
		while(i1.hasNext())
		{
			Entry<String,ArrayList> e= i1.next();
			System.out.println("Key ="+e.getKey());
			for(int i = 0;i<e.getValue().size();i++) {
				System.out.println("Value ="+e.getValue().get(i));
			}
		}
		
	}

}

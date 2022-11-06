package com.prowings.collectionexercisedemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<ArrayList> al=new ArrayList<>();
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		ArrayList<Integer> al3=new ArrayList<>();
		
		Integer a1[]= {4,5,8,9,10};
		Integer a2[]= {2,5,1,10,6};
		Integer a3[]= {3,9,0,10,11};
		
		for (Integer a:a1) {
			al1.add(a);
		}
		for (Integer a : a2) {
			al2.add(a);
		}
	
		for (Integer a : a3) {
			al3.add(a);
		}
	
		
		al.add(al1);
		al.add(al2);
		al.add(al3);
		System.out.println(al);
		
		
		HashMap<ArrayList,Object> h=new HashMap<>();
		h.put(al1, 1);
		h.put(al2, 1);
		h.put(al3, 1);
		
		Set<Entry<ArrayList,Object>> s=h.entrySet();
		for (Entry<ArrayList, Object> entry : s) {
			System.out.println(entry);
			for (int i = 0; i < entry.getKey().size(); i++) {
				if(al1.contains(entry.getKey().get(i)) && al2.contains(entry.getKey().get(i))&& al3.contains(entry.getKey().get(i))) {
					h.put(al2, entry.getKey().get(i));
					h.put(al3, entry.getKey().get(i));
					h.put(al1, entry.getKey().get(i));
				}
					
			}
		}
		System.out.println(h);
		
		
		
		
		
	}

}

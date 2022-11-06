package com.prowings.collectionexercisedemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Demo5 {
public static void main(String[] args) {
	ArrayList<ArrayList> al=new ArrayList<>();
			ArrayList<Integer> al1=new ArrayList<>();
			al1.add(10);
			al1.add(9);
			al1.add(1);
			al1.add(3);
			
			ArrayList<Integer> al2=new ArrayList<>();
			al2.add(9);
			al2.add(2);
			al2.add(0);
			al2.add(5);
			ArrayList<Integer> al3=new ArrayList<>();
			al3.add(5);
			al3.add(10);
			al3.add(8);
			al3.add(11);
		
			al.add(al1);
			al.add(al2);
			al.add(al3);
			System.out.println(al);
			HashMap<Integer, Integer> hm = new HashMap<>();

			for (Integer val : al1) {
				hm.put(val, 1);
			}

			for (Integer val : al2) {
				if (hm.containsKey(val)) {
					int a = hm.get(val) + 1;
					hm.put(val, a);
				} else {
					hm.put(val, 1);
				}
			}

			for (Integer val : al3) {
				if (hm.containsKey(val)) {
					int a = hm.get(val) + 1;
					hm.put(val, a);
				} else {
					hm.put(val, 1);
				}
			}

			System.out.println(hm);

			for (Integer val : hm.keySet()) {
				if (hm.get(val) == 3) {
					System.out.println(val + " ");
				}
			}


			
			
			
}
}

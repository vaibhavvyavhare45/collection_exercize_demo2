package com.prowings.collectionexercisedemo;

import java.util.ArrayList;
import java.util.HashMap;

public class Demo3 {
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

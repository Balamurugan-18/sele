package org.set;

import java.util.LinkedList;
import java.util.TreeSet;

public class Ts {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(1);
		t.add(78);
		t.add(100);
		t.add(25);
		t.add(56);
		t.add(35);
		System.out.println(t);
	

		
		// to remove duplicates and get value in ascending order
		
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(111);
		
		System.out.println("Duplicates "+ll);
		
		TreeSet t1 = new TreeSet(ll);
		System.out.println("No Duplicates and ascending order "+t);
		


		
		

		
	}
}



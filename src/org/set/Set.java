package org.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Set {

	public static void main(String [] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(true);
		hs.add("bala");
		hs.add("raja");
		hs.add(null);
		hs.add(10);
		List l = new ArrayList(hs);
System.out.println(l);	
		for (Object object : l) {
			
			System.out.println(object);
		}
		
		
		
	LinkedHashSet h = new LinkedHashSet();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(true);
		h.add("bala");
		h.add("raja");
		h.add(2.8f);
		h.add(10);

		System.out.println(h);
		
		for(Object o :h) {
			System.out.println(o);
			
		}
//		
//		
//		
//		
	//	LinkedList l = new LinkedList();
//	l.add(10);
//	l.add(100);
//	l.add("oppo");
//	l.add(10);
//	System.out.println("First "+l);
//	Object[] array = l.toArray();
//	for(Object o : array) {
//		System.out.println(o);
//	}
//	 
//	// changing list object into set object
//	
//	LinkedHashSet lhs = new LinkedHashSet(l);
//	System.out.println("after removing duplicates "+lhs);
//	

	
		System.out.println("done");
		System.out.println("merged");
		System.out.println("merged");
	System.out.println("merged");
	System.out.println("merged");
	System.out.println("merged");
	System.out.println("merged");
	System.out.println("merged");
	System.out.println("merged");
	System.out.println("merged");
	System.out.println("merged");
	System.out.println("merged");
	
	
	
	System.out.println("Mani Added");
	
	
	
	
	
	
	
	
	
		
	}	
	}


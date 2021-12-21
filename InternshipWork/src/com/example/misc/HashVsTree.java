package com.example.misc;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashVsTree {
	
	public static void main(String[] args) {
		
		Set<Integer> hashSet = new HashSet<Integer>();
		Set<Integer> treeSet = new TreeSet<Integer>();
		
		hashSet.add(200);
		hashSet.add(100);
		hashSet.add(150);
		hashSet.add(200);
		hashSet.add(300);
		hashSet.add(null);
		
		treeSet.add(100);
		treeSet.add(500);
		treeSet.add(300);
		treeSet.add(100);
		treeSet.add(200);
		//treeSet.add(null);
		
		System.out.println(hashSet);
		System.out.println(treeSet);
		
		System.out.println(((TreeSet<Integer>) treeSet).higher(150));
	}

}

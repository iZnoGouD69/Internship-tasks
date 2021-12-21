package com.example.misc;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class CollectionExample<T> {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		Queue<Integer> queue = new LinkedList<Integer>();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		ArrayDeque<Integer> adq = new ArrayDeque<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.remove(0);
		System.out.println(list);
		
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);	
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
		
		
		queue.offer(100);
		queue.offer(200);
		queue.offer(300);
		queue.offer(400);
		queue.poll();
		System.out.println(queue);
		System.out.println(queue.peek());
		
		
		pq.offer(4000);
		pq.offer(6000);
		pq.offer(1000);
		pq.offer(3000);
		System.out.println(pq);
		
		
		adq.offer(50);
		adq.offer(100);
		adq.offer(200);
		adq.offer(150);
		adq.offerFirst(0);
		adq.offerLast(300);
		System.out.println(adq);

		
		set.add(99);
		set.add(199);
		set.add(299);
		set.add(99);
		set.add(399);
		set.add(499);
		set.remove(499);
		System.out.println(set);
		
		
		map.put("One", 11);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.put("One", 1);
		System.out.println(map);
	}

}



// HashSet vs TreeSet
// Custom Exception
// Generic
// Throws 


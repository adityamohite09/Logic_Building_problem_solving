package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Removeduplicatearraylist {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(20);
		li.add(30);
		
		System.out.println(li);
		
		System.out.println("Remove dupliicate : ");
		Set<Integer> s = new HashSet<>();
		s.addAll(li);
		System.out.println(s);
		
		Collections.sort(li);
		System.out.println(li);
		Collections.shuffle(li);
		System.out.println(li);
		
		
		
	}

}

package com.practice.string;

import java.util.HashMap;

public class Map {
	public static void main(String args[]) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Pony");
		map.put(2, "Dileep");
		map.put(3, "Nishu");
		
		System.out.println(map.size());
		System.out.println(map.get(3));
		System.out.println(map.get(2));
		System.out.println(map.get(1));
		
		for(int i=1;i<=map.size();i++) {
			System.out.println(map.get(i));
		}
	}
}

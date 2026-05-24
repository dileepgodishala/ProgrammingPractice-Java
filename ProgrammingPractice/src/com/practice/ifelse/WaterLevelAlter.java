package com.practice.ifelse;

public class WaterLevelAlter {
	public static void main(String args[]) {
		int level = 100;
		if(level<30) {
			System.out.println("Fill Water Tank");
		}
		else if(level>=30 && level<70) {
			System.out.println("Normal");
		}
		else if(level>=70) {
			System.out.println("Overflow Warning");
		}
	}
}

package com.practice.ifelse;

public class GradeExceptions {

	public static void main(String[] args) {
		int marks = 30;
		if(marks==99) {
			System.out.println("Almost Full");
		}
		else if(marks==100) {
			System.out.println("Perfect");
		}
		else if(marks>=90) {
			System.out.println("A");
		}
		else if(marks>=80 && marks<=89) {
			System.out.println("B");
		}
		else if(marks>=70 && marks<=79) {
			System.out.println("C");
		}
		else if(marks>=60 && marks<=69) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}

	}

}

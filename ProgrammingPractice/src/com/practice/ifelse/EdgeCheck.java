package com.practice.ifelse;

public class EdgeCheck {

	public static void main(String[] args) {
		EdgeCheck ec = new EdgeCheck();
		ec.scoreCheck(0);

	}
	public void scoreCheck(int score) {
		if(score<0 || score>100) {
			System.out.println("Invalid Score");
		}
		else {
			if(score>=90 && score<=100){
				System.out.println("A");
			}
			else if(score>=75 && score<=89) {
				System.out.println("B");
			}
			else if(score>=60 && score<=74) {
				System.out.println("C");
			}
			else if(score>=40 && score<=59) {
				System.out.println("D");
			}
			else {
				System.out.println("F");
			}
		}
		
	}

}

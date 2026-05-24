package com.practice.ifelse;

public class TypeOfTriangles {

	public static void main(String[] args){
		TypeOfTriangles tt = new TypeOfTriangles();
		tt.typeOfTriangles(70, 70, 40);

	}
	public void typeOfTriangles(int a, int b, int c) {
		int sum = a+b+c;
		if(sum!=180) {
			System.out.println("Invalid");
		}
		else {
			if(a==b && b==c && c==a) {
				System.out.println("All are equal --> Equilateral");
				
			}
			else if(a==b || b==c ||  a==c){
				System.out.println("Two equal --> Isosceles");
			}
			else {
				System.out.println("All are different  --> Scalene");
			}
			
		}
	}

}

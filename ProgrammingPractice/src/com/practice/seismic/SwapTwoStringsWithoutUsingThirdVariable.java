package com.practice.seismic;

public class SwapTwoStringsWithoutUsingThirdVariable {

	public static void main(String[] args) {
		
		String a = "Dileep";
		String b = "Godishala";
		
		a = a + b;	//DileepGodishala	- length = 15
		
							//15-9 = 6
		b = a.substring(0, a.length()-b.length());
		
		a = a.substring(b.length());
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
	}

}

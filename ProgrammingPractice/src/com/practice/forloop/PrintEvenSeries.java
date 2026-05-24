package com.practice.forloop;

public class PrintEvenSeries {

	public static void main(String[] args) {
		PrintEvenSeries pe = new PrintEvenSeries();
		//pe.forSeries(20);
		//pe.whileSeries(20);
		pe.dowhileSeries(20);

	}
	public void forSeries(int num) {
		for(int i=2;i<=num;i++) {
			if(i%2==0)
				System.out.print(i+ " ");
		}

	}
	public void whileSeries(int num) {
		int i=1;
		while(i<=num) {
			if(i%2==0)
			System.out.print(i + " ");
			i++;
		}
	}
	
	public void dowhileSeries(int num) {
		int i=1;
		do {
			if(i%2==0) {
				System.out.print(i + " ");
			}
			i++;
		}while(i<=num);
	}
}

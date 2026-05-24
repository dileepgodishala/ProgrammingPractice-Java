package com.practice.forloop;

public class CubesOfNumbers1To10 {
	public static void main(String[] args) {
		CubesOfNumbers1To10 cn = new CubesOfNumbers1To10();
		cn.forCube(10);
		cn.whileCube(10);
		cn.dowhileCube(10);
	}
	public void forCube(int num) {
		int cube = 1;
		for(int i=1;i<=num;i++) {
			cube = i*i*i;
			System.out.println(cube);
		}
	}
	
	public void whileCube(int num) {
		int cube=1,i=1;
		while(i<=num) {
			cube = i*i*i;
			System.out.println(cube);
			i++;
			
		}	
	}
	public void dowhileCube(int num) {
		int i=1, cube=1;
		do {
			cube = i*i*i;
			System.out.println(cube);
			i++;
		}
		while(i<=num);
	}
}

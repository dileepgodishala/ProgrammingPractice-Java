package com.practice.ifelse;

public class SalaryBonus {
	public static void main(String args[]) {
		int exp = 3;
		int salary = 50000;
		if(exp>5) {
			int bonus = (salary*10)/100;
			int finalSalary = salary + bonus;
			System.out.println("Salary of above 5 years exp " + finalSalary);
			
		}
		else if(exp<5) {
			int bonus = (salary*5)/100;
			int finalSalary = salary + bonus;
			System.out.println("Salary of above 5 years exp " + finalSalary);
			
		}
	}
}

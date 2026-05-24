package com.practice.ifelse;

public class PasswordStrength {
	public static void main(String args[]) {
		String password = "765rtyrty787";
		passwordStrength(password);
	}
	public static void passwordStrength(String password) {
		if(password.length()<6) {
			System.out.println("Weak");
		}
		else if(password.matches("[A-Za-z]+") || password.matches("[0-9]+")) {
			System.out.println("Medium");
		}
		else {
			System.out.println("Strong");
		}
	}
}

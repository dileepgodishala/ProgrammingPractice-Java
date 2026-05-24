package com.practice.ifelse;

public class PasswordValidator {

	public static void main(String[] args) {
		PasswordValidator pv = new PasswordValidator();
		pv.passwordCharacter("1243 24324");

	}
	public void passwordCharacter(String Password){
		PasswordValidator pv1 = new PasswordValidator();
		if("[ABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(String.valueOf(Password)) && "abcdefghijklmnopqrstuvwxyz".contains(String.valueOf(Password)) && "1234567890".contains(String.valueOf(Password)) && " ".contains(String.valueOf(Password)) ) {
			pv1.passStrength(Password);
		}
	}
	public void passStrength(String Password) {
		if(Password.length() == 4) {
			System.out.println("Weak");
		}
		else if(Password.length() == 5) {
			System.out.println("Strong");
		}
		else if((" ").contains(Password)) {
			System.out.println("Invalid");	
		}
	}
}

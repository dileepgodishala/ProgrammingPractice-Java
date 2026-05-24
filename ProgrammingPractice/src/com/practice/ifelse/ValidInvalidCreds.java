package com.practice.ifelse;

public class ValidInvalidCreds {
	public static void main(String args[]) {
		String username = "poornima";
		String password = "12345";
		System.out.println(isvalid(username, password));
	}
public static boolean isvalid(String username, String password) {
	if(username.equals("Poornima") && password.equals("12345")) {
		return true;
	}
	else
		return false;
}
}

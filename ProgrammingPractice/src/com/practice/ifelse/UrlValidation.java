package com.practice.ifelse;

public class UrlValidation {

	public static void main(String[] args) {
		String url1 = "https://kdfgjdlf.com";
		String url2 = "http://slkdjfbjdfkkj.com";
		
		if(url1.startsWith("https://")) {
			System.out.println("Secure");
		}
		else if(url2.startsWith("http://")) {
			System.out.println("Not Secure");
		}
		else {
			System.out.println("Invalid URL");
		}

	}
	

}

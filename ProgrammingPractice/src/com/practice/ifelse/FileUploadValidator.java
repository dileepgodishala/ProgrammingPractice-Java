package com.practice.ifelse;

public class FileUploadValidator {

	public static void main(String[] args) {
		FileUploadValidator fu = new FileUploadValidator();
		fu.fileValidation("pdf", 19, false);

	}
	public void fileValidation(String filetype, int sizeMB, boolean isEncrypted) {
		if(isEncrypted == true) {
			System.out.println("Not Allowed");
		}
		else {
			if((filetype.equals("jpg")) || (filetype.equals("png"))) {
				if(sizeMB<=5) {
					System.out.println("Accepted");
				}
				else {
					System.out.println("File Too Big");
				}		  
			}
			else if(filetype.equals("pdf")) {
				if(sizeMB<=20) {
					System.out.println("Accepted");
				}
				else {
					System.out.println("File Too Big");
				}			
			}
		}
	}
}

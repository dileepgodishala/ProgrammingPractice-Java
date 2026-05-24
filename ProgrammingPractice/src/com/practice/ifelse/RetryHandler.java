package com.practice.ifelse;

public class RetryHandler {

	public static void main(String[] args) {
			RetryHandler rh = new RetryHandler();
			rh.requestRetry(500, 2);
	}
	public void requestRetry(int httpStatus, int rCount) {
		if(httpStatus == 200) {
			System.out.println("Success-No Retry");
		}
		else if(httpStatus==400 || httpStatus==403) {
			System.out.println("Do Not Retry-Client Issue");
		}
		else if(httpStatus==401) {
			System.out.println("Retry After Auth");
		}
		else if(httpStatus==500) {
			if(rCount<3) {
				System.out.println("Retry");
			}	
			else {
				System.out.println("Give Up");
			}
		}
		
	}
	
}

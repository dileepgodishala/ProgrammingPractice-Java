package com.practice.ifelse;

public class BugSeverity {

	public static void main(String[] args) {
		BugSeverity bs = new BugSeverity();
		bs.bugClassifier(false, false, true, "Big");
	}
	public void bugClassifier(boolean isCrash, boolean isDataLoss, boolean rSteps, String freq) {
		if(isCrash==true || isDataLoss==true) {
			System.out.println("Critical");
		}
		else if(rSteps== false) {
			System.out.println("Low");
		}
		else if(freq.equals("High")) {
			System.out.println("High Severity");
		}
		else if(freq.equals("Medium")) {
			System.out.println("Medium Severity");
		}
		else {
			System.out.println("Low Severity");
		}
	}
}

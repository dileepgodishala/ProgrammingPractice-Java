package com.practice.ifelse;

public class InsuranceClaim {

	public static void main(String[] args) {
		  InsuranceClaim ic = new InsuranceClaim();
		  ic.insurClaim("Minor", 0, true);
		
	}
	public void insurClaim(String accType, int dAge, boolean alcohol) {
		if(alcohol==true) {
			System.out.println("Claim Reject");
		}
		else if(accType.equals("Major") && dAge<25) {
			System.out.println("Rejected");
		}
		else if(accType.equals("Minor")) {
			System.out.println("Accept");
		}
		else if(accType.equals("Major") && dAge>=25) {
			System.out.println("Accepted");
		}
	}
}

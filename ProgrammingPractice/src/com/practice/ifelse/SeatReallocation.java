package com.practice.ifelse;

public class SeatReallocation {

	public static void main(String[] args) {
		SeatReallocation sr=new SeatReallocation();
		sr.cinemaSeat("Standard", 101, 101, 101);
	}
	public void cinemaSeat(String seatC, int ocV,int ocS, int ocE){
		if(seatC.equals("VIP")) {
			if(ocV<100) {
				System.out.println("Seat Confirmed");
			}
			else {
				if(ocS<100) {
					System.out.println("Move to Standard");
				}
				else if(ocE<100) {
					System.out.println("Move to Eco");
				}
				else {
					System.out.println("House Full");
				}
			}
		}
		else if(seatC.equals("Standard")){
			if(ocS<100) {
				System.out.println("Seat Confirmed");
			}
			else {
				if(ocE<100) {
					System.out.println("Move to Eco");
				}
				else {
					System.out.println("House Full");
				}
			}
		}
		else if(seatC.equals("Eco")) {
			if(ocE<100) {
				System.out.println("Seat Confirmed");
			}
			else {
				System.out.println("House Full");
			}
		
		}
		else {
			System.out.println("Reallocation Logic");
		}
	}
	
}


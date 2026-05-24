package com.practice.ifelse;

public class NetworkSpeed {

	public static void main(String[] args) {
		NetworkSpeed ns = new NetworkSpeed();
		ns.networkSpeed(150, 60, 10);
			

	}
	public void networkSpeed(int download, int upload, int latency) {
		if(download<=0 && upload<=0 && latency<=0) {
			System.out.println("Invalid");
		}
		else {
		if(download>=100 && upload >=50 && latency <=20) {
			System.out.println("Excellent");
		}
		else if(download>=50 && upload>=20 && latency<=50) {
			System.out.println("Good");
		}
		else if(download>=20) {
			System.out.println("Average");
		}
		else {
			System.out.println("Poor");
		}
	}
	}
}

package com.practice.ifelse;

public class MedicalEmergency {
	public static void main(String[] args) {
		MedicalEmergency me = new MedicalEmergency();
		me.medEmergency(0, 100, 0);
	}
	public void medEmergency(int hRate, int oLevel, int temp) {
		if(oLevel<=90) {
			System.out.println("Critical");
		}
		else {
			if(hRate>=120 && temp>=102) {
				System.out.println("High Risk");
			}
			else if(hRate>=100) {
				System.out.println("Moderate Risk");
			}
			else if(temp>=100) {
				System.out.println("Fever");
			}
			else {
				System.out.println("Normal");
			}
		}
	}
}

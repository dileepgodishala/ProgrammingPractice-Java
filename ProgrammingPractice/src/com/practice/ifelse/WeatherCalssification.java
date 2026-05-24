package com.practice.ifelse;

public class WeatherCalssification {

	public static void main(String[] args) {
		WeatherCalssification wc = new WeatherCalssification();
		wc.weatherCheck(23, 38, 0);

	}
	public void weatherCheck(int temp, int humid, int wind) {
		if(temp<=20 && humid>=80 && wind >=40) {
			System.out.println("Thunderstorm");
		}
		else if(temp>=40 && humid<=30) {
			System.out.println("Dry Heat");
		}
		else if((temp>=20 || temp<=30) && (humid>=40 || humid<=60)) {
			System.out.println("Pleasant");
		}
		else if(temp<=15 && wind>=20) {
			System.out.println("Cold Breeze");
		}
		else {
			System.out.println("Normal Weather");
		}
	}

}

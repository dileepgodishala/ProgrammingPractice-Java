package com.interview.as;

public class SharePriceProfit {

	public static void main(String[] args) {
		int[] arr = {12,13, 5, 6, 9, 7, 20};
		
//		int[] arr = {20, 15, 10, 5, 1};
		
		int maxProfit = 0;
		int finalBuyingPrice = 0;
		int finalSellingPrice = 0;
		int currentProfit = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
//				if(arr[i]>arr[j]) {
//					 currentProfit = arr[i]-arr[j];
//				}
//				else {
					 currentProfit = arr[j]-arr[i];
//				}
					 finalBuyingPrice = arr[i];
					 finalSellingPrice = arr[j];
					 
				
				if(currentProfit > maxProfit) {
					maxProfit = currentProfit;
					finalBuyingPrice = arr[i];
					finalSellingPrice = arr[j];
				}
				
			}
		}
		
		System.out.println("Max profit: " + maxProfit );
		System.out.println("Final Byuing price: " + finalBuyingPrice );
		System.out.println("Final Selling price: " + finalSellingPrice );
		
		

	}

	
	//Check for O(n)
	//Check for both inputs
}

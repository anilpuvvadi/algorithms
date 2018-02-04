package com.home.algorithms.dp;

public class RecursiveMultiply {
	
	private static int multiply(int smaller, int bigger){
		
		if (smaller == 0) return 0;
		if (smaller == 1) return bigger;
		int s = smaller >> 1;
		int halfprod = multiply(s, bigger);
		if(smaller%2 == 1){
			return halfprod + halfprod + bigger;
		} else{
			return halfprod + halfprod ;
		}
	}
	
	private static int multiplyNow(int i, int j) {
		int bigger= i>j?i:j;
		int smaller = i<j?i:j;
		return multiply(smaller,bigger);
	}
	
	public static void main(String args[]){
		System.out.println("Product => "+multiplyNow(10,8));
	}

}
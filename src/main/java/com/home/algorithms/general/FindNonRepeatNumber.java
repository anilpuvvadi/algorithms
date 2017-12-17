package com.home.algorithms.general;

public class FindNonRepeatNumber {
	
	public static int findonenumber(int[] array){
		int result=0;
		for(int item:array){
			result ^= item;
		}
		return result;
	}
	public static void main(String args[]) {
		System.out.println(FindNonRepeatNumber.findonenumber(new int[]{1,2,3,4,5,6,6,5,3,2,1}));
	}

}

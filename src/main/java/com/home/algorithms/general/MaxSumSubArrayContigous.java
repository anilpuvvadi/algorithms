package com.home.algorithms.general;

public class MaxSumSubArrayContigous {
	
	public static int findmaxsumsubarray(int a[]){	
		int max_so_far = 0;
		int max_until_here = 0;
		for(int i =0;i<a.length;i++){
			max_until_here+=a[i];
			if(max_until_here<0){
				max_until_here = 0;
			}
			if(max_until_here>max_so_far){
				max_so_far = max_until_here;
			}
		}
		return max_so_far;
	}
	
	public static void main(String args[]){
		int a[][] = new int[][] {
			{3,4,5,6},
			{7,8,9,10},
			{11,12,13,14}
		};
		int[] test = new int[3];
		test[0] = 1;
		test[1] = 2;
		for(int i =0;i<test.length;i++){
			System.out.println("******a[i]******"+ test[i]);
		}
		int k = a.length;
		System.out.println("******k******"+ a.length);
		System.out.println("******k******"+ a[0].length);
		System.out.println("******k******"+ k);
		System.out.println(MaxSumSubArrayContigous.findmaxsumsubarray(new int[]{-2, -3, 4, -1, -2, 1, 10, -3}));
	}

}

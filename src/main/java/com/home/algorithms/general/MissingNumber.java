package com.home.algorithms.general;

public class MissingNumber {

	public int missingnumber(int a[]){
		
		int X1=a[0],X2=1;
		for(int i=1;i<a.length;i++)
		 X1= X1^a[i];

		for(int i =2;i<=a.length+1;i++)
		{
			 X2 = X2^i;
		}
		
		return X1^X2;
	}
	
	public static void main(String args[]){
		MissingNumber m = new MissingNumber();
		System.out.println(" "+m.missingnumber(new int[]{1,2,3,4,5,7,8,9,10,11}));
	}
}

package com.home.algorithms.dp;

public class Subset2 {

	
	public static void printsubset(char a[]){
		int size  = a.length;
		for(int i =0; i< 1<<size;i++){
			System.out.print("{");
			for(int j=0;j<size;j++){
				if((i & 1<<j)>0){
					System.out.print(a[j]+" ");
				}
			}
			System.out.print("}");
			System.out.println("");
		}
	}
	public static void main(String[] args){
		char a[] = {'a','b','c'};
		printsubset(a);
	}
}

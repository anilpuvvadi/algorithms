package com.home.algorithms;

public class KLargest {
	
	public static void main(String args[]){
		int a[] = {40, 30, 60, 20, 50, 80, 90, 10,70,100};
		int low =0;
		int high = a.length-1;
		int res = findKLargest(1,a,low,high);
        System.out.println("res =>"+ res);		
	}

	public  static int findKLargest(int k,int a[],int low,int high){
		k=a.length-k;
		while(low<high){
		int pi = partition(a,low,high);
			if(pi<k){
				low = pi+1;
			} else if (pi>k){
				high = pi-1;
			} else {
					return a[pi];
			}
		}
		return a[k];
	}

	public static int partition(int a[], int low, int high){
		int i = low;
		int pivot = a[high];
		for(int j=low;j<high;j++){
			if(a[j]<=pivot){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				
			}
		}
		int temp = a[i];
		a[i] = a[high];
		a[high] = temp;
		return i;
		
	}
	
}
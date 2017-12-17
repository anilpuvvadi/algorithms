package com.home.algorithms;

public class QuickSort {
	
	public static void main(String args[]){
		int a[] = {40, 	30, 60, 20, 50, 80, 90, 10,70,100};
		int low =0;
		int high = a.length-1;
		findKLargest(a,low,high);
		printArray(a);	
	}
	  /* A utility function to print array of size n */
    public  static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 

	public  static void findKLargest(int a[],int low,int high){
		if(low<high){
			int pi = partition(a,low,high);
			findKLargest(a,low,pi-1);
			findKLargest(a,pi+1,high);
		}
		
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
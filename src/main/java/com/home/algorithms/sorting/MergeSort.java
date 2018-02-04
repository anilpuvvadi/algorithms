package com.home.algorithms.sorting;

public class MergeSort {

	public void mergesort(int a[], int low,int high){
		  
		  while(low<high){
		    int mid = low+(high-low)/2;
		    mergesort(a,low,mid);
		    mergesort(a,mid+1,high);
		    merge(a,low,mid,high);
		  }

		}

		public void merge(int a[], int low,int mid,int high){
		  int tmpsize = mid-low+1;
		  int tmp1size = high-mid;
		  int tmp[] = new int[tmpsize];
		  int tmp1[] = new int[tmp1size];
		  for(int i=0;i<tmpsize;i++){
		    tmp[i] = a[low+i];
		  }
		   for(int i=0;i<tmp1size;i++){
		    tmp1[i] = a[mid+1+i];
		  }
		    int i =0;
		  int j = mid+1;
		  int k = low;
		  while(i<mid && j<high){
		    if(a[i]<a[j]){
		      tmp[k++] = a[i++];
		    }
		    else if (a[i]>a[j]){
		      tmp[k++] = a[j++];
		    }
		    while(i<mid){
		      tmp[k++]=a[i++];
		    }
		    while(j<high){
		      tmp[k++]=a[j++];
		    }

		  }
		  }
}

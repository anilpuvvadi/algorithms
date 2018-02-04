package com.home.algorithms.general;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
	public void distinct(int[] a, int k){
		if(a== null || a.length<k){
			System.out.println("array is null or k is greater than a");
			return;
		}
		int count =0;
		Set<Integer> dist = new HashSet<Integer>();
		for(int i =0;i<a.length;i++){
			dist.add(a[i]);
			count++;
			if(count==k){
				System.out.println("****start****");
				System.out.println(dist);
				System.out.println("****end****");
				dist = new HashSet<Integer>();
				count=0;
			}
		}
		if(!dist.isEmpty())
		System.out.println(dist);
	}
	
	public static void main(String args[]) {
		Distinct d = new Distinct();
		d.distinct(new int[]{1,2,3,4,5,6,6,5,3,2,1,3},4);
	}

}

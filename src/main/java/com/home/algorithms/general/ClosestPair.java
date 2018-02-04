package com.home.algorithms.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestPair {
	
	class Pair{
		int a;
		int b;
		Pair(int a, int b){
			this.a = a;
			this.b = b;
		}
	}
	public List<Pair> findclosestpair(int[] a){
		List<Pair> pairs = new ArrayList<Pair>();
		Arrays.sort(a);
		int mindiff = a[1]-a[0];
		Pair p = new Pair(a[0],a[1]);
		pairs.add(p);
		for(int i =1;i<a.length-1;i++){
			
			if((a[i+1]-a[i])<mindiff){
				mindiff = a[i+1]-a[i];
				pairs.clear();
				pairs.add(new Pair(a[i],a[i+1]));
			} else if(mindiff==a[i+1]-a[i]){
				pairs.add(new Pair(a[i],a[i+1]));
			}
			
		}
		return pairs;
	}
	public static void main(String args[]){
		int[] a = new int[]{10,12,40,50,52,100,101};
		ClosestPair p = new ClosestPair();
		List<Pair> l = p.findclosestpair(a);
		for(Pair pair:l){
			System.out.println("****a"+pair.a);
			System.out.println("****b"+pair.b);
		}
	}

}

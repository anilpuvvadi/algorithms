package com.home.algorithms.general;


public class MaxProdPair {

	public static void main(String args[]) {
	 System.out.println(MaxProdPair.maxprodpair(new int[]{-1, -3, -4, 2, 0, -5}));

	}
	
public static int maxprodpair(int a[]){

	int neghighestproduct = 0;
	int	neghighest = 0;
	int	poshighest_Prod =0;
	int	poshighest = 0;

for ( int i =0;i<a.length;i++) {
	
if(a[i]<0) {
	if(neghighest == 0){
		neghighest = a[i];
	}
	else{
		if((neghighest * a[i])>neghighestproduct){
			neghighestproduct= neghighest * a[i];
		}
		if( Math.abs(a[i])>Math.abs(neghighest)){
			neghighest = a[i];
		}
		}
	
} else {
	if(poshighest == 0){
		poshighest = a[i];
	}
	else {
		if((poshighest * a[i])>poshighest_Prod){
			poshighest_Prod= poshighest * a[i];
		}
		if(a[i]>poshighest){
			poshighest = a[i];
		}
	}
	}
}

if(poshighest_Prod>neghighestproduct){
	return poshighest_Prod;
	}
return neghighestproduct;
}
}

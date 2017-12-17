package com.home.algorithms.dynamicprogramming;

public class MinimumCoins {
	
	private int[] T;
	private int[] R;
	private int[] coins;
	private int total;
	public MinimumCoins(int[] coins, int total){
		
		 this.T = new int[total+1];
		 this.R = new int[total+1];
		 this.coins = coins;
		 this.total = total;
		 
		 T[0] = 0;
		for(int i =1; i<T.length;i++){
			T[i] = Integer.MAX_VALUE-1;
		}
		for(int i =0; i<R.length;i++){
			R[i] = Integer.MIN_VALUE;
		}
	}
	
	private void getMinCoins() {
		for(int i =0;i<coins.length;i++){
			for(int j = 1; j<T.length; j++){
				if(j>=coins[i]){
					if(T[j]>1+T[j-coins[i]]){
						T[j] = 1+T[j-coins[i]];
						R[j] = i;
					}
				}
			}
		}
		printCombinations(total);
	}
	
    private void printCombinations(int total){
    	int ttl = total;
    	int start = R.length -1;
    	System.out.println("***combinations**");
    	if(R[start]==Integer.MIN_VALUE){
            System.out.print("No solution is possible");
            return;
    	}
    	while(ttl!=0){
    		ttl = ttl- coins[R[start]];
    		System.out.println(coins[R[start]]);
    		System.out.println("");
    		start = ttl;
    	}
    	
    }
    
	public static void main(String args[]){	
		int[] coins = {7,3,2,6};
		int total = 1;
		MinimumCoins mc = new MinimumCoins(coins,total);
		mc.getMinCoins();	
	}

}

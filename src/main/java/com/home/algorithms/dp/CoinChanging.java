package com.home.algorithms.dp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoinChanging {

    public int numberOfSolutions(int total, int coins[]){
        int temp[][] = new int[coins.length+1][total+1];
        for(int i=0; i <= coins.length; i++){
            temp[i][0] = 1;
        }
        for(int i=1; i <= coins.length; i++){
            for(int j=1; j <= total ; j++){
                if(coins[i-1] > j){
                    temp[i][j] = temp[i-1][j];
                }
                else{
                    temp[i][j] = temp[i][j-coins[i-1]] + temp[i-1][j];
                }
            }
        }
        return temp[coins.length][total];
    }

    /**
     * Space efficient DP solution
     */
    public int numberOfSolutionsOnSpace(int total, int arr[]){

        int temp[] = new int[total+1];

        temp[0] = 1;
        for(int i=0; i < arr.length; i++){
            for(int j=1; j <= total ; j++){
                if(j >= arr[i]){
                    temp[j] += temp[j-arr[i]];
                }
            }
        }
        return temp[total];
    }

    /**
     * This method actually prints all the combination. It takes exponential time.
     */
    public void printCoinChangingSolution(int total,int coins[]){
        List<Integer> result = new ArrayList<>();
        printActualSolution(result, total, coins, 0);
    }
    
    private void printActualSolution(List<Integer> result,int total,int coins[],int pos){
        if(total == 0){
            for(int r : result){
                System.out.print(r + " ");
            }
            System.out.print("\n");
        }
        for(int i=pos; i < coins.length; i++){
            if(total >= coins[i]){
                result.add(coins[i]);
                printActualSolution(result,total-coins[i],coins,i);
                result.remove(result.size()-1);
            }
        }
    }

    public static void main(String args[]) throws FileNotFoundException{
//        CoinChanging cc = new CoinChanging();
//        int total = 5;
//        int coins[] = {1,2,3};
//        System.out.println(cc.numberOfSolutions(total, coins));
//        System.out.println(cc.numberOfSolutionsOnSpace(total, coins));
//        cc.printCoinChangingSolution(total, coins);
    	System.out.println("new"+(32000>>5));
    	Scanner in = new Scanner(new FileReader(""));
    	long numberofInts = (long) Integer.MAX_VALUE+1;
    	byte[] bitfield = new byte[(int)(numberofInts/8)];
    	while(in.hasNextInt()){
    		int n = in.nextInt();
    		bitfield[n/8] |= 1 << (n%8);
    	}
    	for(int i =0;i<bitfield.length;i++){
    		for(int j=0;j<8;j++){
    			if(( bitfield[i] & (1 <<j))==0){
    				System.out.println(""+i*8+j);
    				return;
    			}
    		}
    	}
     }
}
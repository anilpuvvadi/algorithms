package com.home.algorithms.search;

public class KMP {

	//slow
	public boolean substring(char text[], char pattern[]) {

		int k = 0, j = 0, i=0;
		while(i<text.length && j<pattern.length) {
	
		if (text[i] == pattern[j]) {
				j++;
				i++;
			} else {
				k++;
				i = k;
				j = 0;
			}
		}
		if (j == pattern.length)
			return true;
		return false;
	}
	
	public boolean kmp(char[] text, char[] pattern){		
		int[] kmp = formpatternarray(pattern);
		int i =0;
		int j =0;
	    while(i<text.length && j<pattern.length){
	    	if(pattern[j]==text[i]){
	    		i++;
	    		j++;
	    	} else {
	    		if(j!=0){
	    			j = kmp[j-1];
	    		}
	    		else{
	    			i++;
	    		}
	    	}    	
	    }
		if(j==pattern.length) {
			return true;
		}
		return false;		
	}
	
	private int[] formpatternarray(char[] pattern) {
		int[] indarr = new int[pattern.length];
		int j=0;
		for(int i=1; i < pattern.length;){
			System.out.println("i=> "+i);
			System.out.println("j=> "+j);
			if(pattern[i]==pattern[j]){
				indarr[i] =j+1;
				j++;
				i++;	
				}
			else {
				if(j!=0){
					j = indarr[j-1];
				} else{
				indarr[i]=0;
				i++;	
				}
			}
			
		}
		return indarr;
	}

	public static void main(String args[]){
		KMP r = new KMP();
		System.out.println(r.kmp("aabceabfeaeabcd".toCharArray(), "dadadd".toCharArray()));
	}

}
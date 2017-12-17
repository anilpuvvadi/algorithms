package com.home.algorithms.general;

public class KMP {

	public boolean patternMatch(char text[], char pattern[]) {

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
	
	public boolean substring(char[] text, char[] pattern){		
		int[] kmp = formpatternarray(pattern);
		int i =0;
		int j =0;
	    while(i<text.length && j<pattern.length){
	    	if(pattern[i]==text[i]){
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
		int i =1;
		indarr[0] = 0;
		while (i<pattern.length){
			
			if(pattern[i]!=pattern[j]){
			
					if(j!=0){
						j = pattern[j-1];
					} else{
					pattern[i]=0;
					i++;	
					}
					
					
				}
			else {
				indarr[i] =j+1;
				j++;
				i++;
			}
			
		}
		return indarr;
	}

	public static void main(String args[]){
		KMP r = new KMP();
		System.out.println(r.patternMatch("aabceabfeaeabcd".toCharArray(), "aabceabfeaeabcd".toCharArray()));
	}

}
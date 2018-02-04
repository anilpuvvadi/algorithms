package com.home.algorithms.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class PermutationEnhanced {

	public Map<Character,Integer> buildFrequencyMap(String s){
		Map<Character,Integer> freqMap = new HashMap<Character,Integer>();
		for(char c : s.toCharArray()){
			if(!freqMap.containsKey(c)){
				freqMap.put(c,0);
			} 
			int count = freqMap.get(c);
			freqMap.put(c,count+1);
			
		}
		return freqMap;
	}
	
	public void printperms(Map<Character, Integer> frequencyMap,
			String prefix, int remaining, ArrayList<String> results) {
		if(remaining==0){
			System.out.println(prefix);
			results.add(prefix);
			return;
		}
			for(char c :frequencyMap.keySet()){
				int count = frequencyMap.get(c);
				if(frequencyMap.get(c)>0){
					frequencyMap.put(c, count-1);
					printperms(frequencyMap,prefix+c,remaining-1,results);
					frequencyMap.put(c, count);
					
				}
			}
		}
		
	
	public static void main(String args[]){
		String s = "((()))";
		PermutationEnhanced perm = new PermutationEnhanced();
		perm.printperms(perm.buildFrequencyMap(s),"",s.length(),new ArrayList<String>());
	}


	
}

package com.home.algorithms.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupingAnagrams {
	
	public void groupAnagrams(String[] array){
	Map<String,List<String>> map = new HashMap<String,List<String>>();

	for(String s:array){	
		String key = sortchars(s);
		if(map.containsKey(key)){
			map.get(key).add(s);
		}
		List<String> l= new ArrayList<String>();
		l.add(s);
		map.put(key,l);
	}

	for(String key: map.keySet()){
		List<String> strlist = map.get(key);
		int i =0;
		for(String s:strlist){
			array[i]=s;
			i++;
		}
	}
	}
	private String sortchars(String s){
		char[] strchar=s.toCharArray();
		Arrays.sort(strchar);
		return new String(strchar);
	}

}

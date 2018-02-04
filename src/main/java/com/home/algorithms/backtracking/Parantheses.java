package com.home.algorithms.backtracking;

public class Parantheses {
	
	public static void create_paranthesis(String parantheses, int openbraces_cnt, int closebraces_cnt,int n){
		
	if(closebraces_cnt==n){
		System.out.println(parantheses);
		return;
	} else{
		if(openbraces_cnt>closebraces_cnt){
			create_paranthesis(parantheses+')',openbraces_cnt,closebraces_cnt+1,n);
		}
		if(openbraces_cnt<n){
			create_paranthesis(parantheses+'(',openbraces_cnt+1,closebraces_cnt,n);
		}
	}
	}
	public static void main(String args[]){
		create_paranthesis("",0,0,4);
	}

}

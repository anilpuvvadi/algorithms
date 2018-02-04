package com.home.algorithms.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Solution4 {
	
	public List<String> generateParenthesis(int n){
		List<String> paranthesesList = new ArrayList<String>();
		create_paranthesis ("",0,0,paranthesesList,n);
		return paranthesesList;
	
	}
	public void create_paranthesis(String parantheses, int openbraces_cnt, int closebraces_cnt, List<String> paranthesesList,int n ){
		
		if(openbraces_cnt == n && closebraces_cnt== n){
			paranthesesList.add(parantheses);
			return;
		}
		if(openbraces_cnt<n){
			create_paranthesis(parantheses+"(", openbraces_cnt+1, closebraces_cnt,paranthesesList,n);
		}
		if(openbraces_cnt>closebraces_cnt){
			create_paranthesis(parantheses+")", openbraces_cnt, closebraces_cnt+1,paranthesesList,n);
		}
	}
	
	public void printList(List<String> paranthesis){
		for(String s:paranthesis){
			System.out.println(s);
		}
		
	}
	public static void main(String args[]){
		Solution4 s =new Solution4();
		List<String>paranthesis = s.generateParenthesis(3);
		s.printList(paranthesis);
	}
}

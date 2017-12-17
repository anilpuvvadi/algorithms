package com.home.algorithms;

import java.util.Set;

public class MultiProblems {

	public static void main(String args[]) {
		System.out.println(MultiProblems.findonenumber(new int[]{1,2,3,4,5,6,6,5,3,2,1}));
		//System.out.println(IntTest
			//	.checkpalindrome("A man, a plan, a canal: Panama"));
	//	IntTest.permutation(new StringBuffer("ABCDE"), new StringBuffer(""),
		//		new HashSet<String>());
		// IntTest.checkpalindrome("MALAYALAM");
	// Integer prod = IntTest.maxprodpair(new int[]{-1, -3, -4, 2, 0, -5} );
//		int[][] matrix =  {
//		        { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
//		        { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1 },
//		        { 1, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
//		        { 1, 0, 0, 1, 1, 0, 0, 0, 0, 1 },
//		        { 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
//		        { 1, 0, 1, 1, 1, 1, 1, 1, 0, 0 },
//		        { 1, 0, 0, 0, 0, 0, 0, 1, 0, 1 },
//		        { 1, 0, 1, 1, 1, 1, 0, 0, 1, 1 },
//		        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
//		    };
//		int ROW = matrix.length;
//		int COL = matrix[0].length;
//		IntShortestPath path = new IntShortestPath(ROW,COL);
//		int shortestpath = path.invokeBFS(matrix);
//		System.out.println("shortest path => "+shortestpath);
	}

	public static boolean checkpalindrome(String str) {
		if (str.isEmpty()) {
			return true;
		}
		char[] sa = str.toLowerCase().toCharArray();
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (!Character.isLetterOrDigit(sa[i])) {
				i++;
			} else if (!Character.isLetterOrDigit(sa[j])) {
				j--;
			} else {
				if (Character.isLetterOrDigit(sa[i]) != Character
						.isLetterOrDigit(sa[j]) || sa[i] != sa[j]) {
					return false;
				}
				i++;
				j--;
			}
		}

		return true;
	}

	public static int findonenumber(int[] array){
		int result=0;
		for(int item:array){
			result ^= item;
		}
		return result;
	}
	
	public static void permutation(StringBuffer s, StringBuffer chosen,
			Set<String> alreadychosenlist) {
		if (s.toString().isEmpty() && !alreadychosenlist.contains(chosen.toString())) {
			System.out.println(chosen);
			alreadychosenlist.add(s.toString());
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			chosen = chosen.append(c);
			s = s.deleteCharAt(i);
			permutation(s, chosen, alreadychosenlist);
			chosen = chosen.deleteCharAt(chosen.length() - 1);
			s = s.insert(i, c);
		}
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

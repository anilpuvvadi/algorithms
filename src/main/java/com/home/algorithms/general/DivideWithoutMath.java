package com.home.algorithms.general;

public class DivideWithoutMath {

public long divide(long x, long y){
	long result = 0;
	int power = 32;
	long ypower = y<<power;
	while(x>=y){
		while(ypower>x){
			ypower>>>=1;
			--power;
		}
		result += 1L<<power;

		x -= ypower;
	}
	return result;
}


//*******Time Complexity****** -O(n)
//*******Space Complexity***** - O(1)
//Brute force is to iteratively subtract y from x and keep track of count until x<y. But time complexity is too high. What if x is 2^31 and y is 1. It takes 2^31 
// iterations. While the above program is based on shift operations and x is at least havled in each iteration.

public static void main(String args[]){
	DivideWithoutMath d = new DivideWithoutMath();
	System.out.println(""+d.divide(250, 3L));
}

}

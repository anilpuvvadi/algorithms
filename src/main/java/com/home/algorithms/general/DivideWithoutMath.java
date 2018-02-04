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

public static void main(String args[]){
	DivideWithoutMath d = new DivideWithoutMath();
	System.out.println(""+d.divide(250, 2L));
}

}

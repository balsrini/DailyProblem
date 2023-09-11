package com.binaysearch;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A fixed point in an array is an element whose value is equal to its index. Given a sorted array of distinct elements, return a fixed point, if one exists. Otherwise, return False.
	For example, given [-6, 0, 2, 40], you should return 2. Given [1, 5, 7, 8], you should return False.
 * 
 */
public class One {

	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(-6,0,2,40)) ;
		System.out.println(getFixedPoint(A, 0, A.size()-1));
		ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(1,5,7,8)) ;
		System.out.println(getFixedPoint(B, 0, B.size()-1));
	}

	public static int getFixedPoint(ArrayList<Integer> a,int sLen,int eLen)
	{
		int pivot = (eLen - sLen)/2 +1;	
		if(pivot < sLen || pivot > eLen)
			return -1;
		if(pivot == a.get(pivot))
			return pivot;
		else if(a.get(pivot) > pivot)			
			return getFixedPoint(a, pivot , eLen);
		else
			return getFixedPoint(a, sLen,pivot);

	}

}





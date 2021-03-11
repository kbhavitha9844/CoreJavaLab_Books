package com.cg.lb2.ui;

import java.util.Arrays;

public class Exercise3 {
	static int[] getSorted(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			int tempSum=0;
			while(ar[i]!=0) {
				tempSum *=10;
				tempSum +=ar[i]%10;
				ar[i] /=10;
			}
			ar[i]=tempSum;
		}
		Arrays.sort(ar);
		return ar;
	}

}

package com.cg.lb2.ui;

import java.util.Arrays;

public class Exercise2 {
	static String[] sortStrings(String[] ar) {
		Arrays.sort(ar);
		int len = ar.length%2==0 ? ar.length/2 : ar.length/2+1;
		for(int i=0;i<len;i++) {
			ar[i]=ar[i].toUpperCase();
		}
			return ar;
	}
 

}

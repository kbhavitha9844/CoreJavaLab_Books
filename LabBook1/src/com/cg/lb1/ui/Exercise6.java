package com.cg.lb1.ui;
import java.util.*;
import java.lang.Math;
public class Exercise6 {
	static int sum1=0,sum2=0;
	static double sum;
	static double calculateDifference(int n) {
		for(int i=1;i<=n;++i) {
			sum1+=(Math.pow(i, 2));
			sum1+=i;
			sum=sum1-(Math.pow(sum2, 2));
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(calculateDifference(n));
		s.close();

	}

}

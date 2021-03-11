package com.cg.lb1.ui;
import java.util.*;
public class Exercise5 {
	static int sum=0;
	static int calculateSum(int n)
	{
		for(int i=1;i<=n;++i) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n =s.nextInt();
		System.out.println(calculateSum(n));
		s.close();
	}

}

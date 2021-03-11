package com.cg.lb1.ui;
import java.util.*;
public class Exercise3 {
	static int a=1,b=1,c=0;
	static int Fib(int n) {
		if (n>0) {
			c=b;
			b+=a;
			a=c;
			Fib(n-1);
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(Fib(n-1));
		s.close();
	}
}

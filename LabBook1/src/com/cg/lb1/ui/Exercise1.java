package com.cg.lb1.ui;
import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int sum=0;
		while(a>0) {
			int r=a%10;
			sum+=(r*r*r);
			a-=r;
			a/=10;
		}
		System.out.println(sum);
		s.close();
	}

}


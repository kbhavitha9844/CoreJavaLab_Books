package com.cg.lb1.ui;
import java.util.*;
public class Exercise8 {
	static Boolean checkNumber(int n) {
		while(n/2!=1) {
			if(n%2!=0) {
				return false;
				}
			n/=2;
			}
			return true;
		}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(checkNumber(n));
	}

}

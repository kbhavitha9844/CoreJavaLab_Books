package com.cg.lb5.ui;
import java.util.Scanner;

	@SuppressWarnings("serial")
	class AgeException extends Exception {
		private String msg;
	 
		public AgeException(String msg) {
			this.msg = msg;
	 }
		public String toString() {
			return msg;
	 }
	}
	public class Exercise1 {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter ur age :: ");
			int age = s.nextInt();
			s.close();
			try {
				if(age < 18) 
					throw new AgeException("Invalid age");
				else
					System.out.println("Valid age");
				}
			catch (AgeException a) {
				System.out.println(a);
				}
			}
		}
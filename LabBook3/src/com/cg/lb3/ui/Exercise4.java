package com.cg.lb3.ui;

import java.util.Scanner;

public class Exercise4 {
	public static int removeDuplicates(int arr[], int n) {
		
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int[] temparr = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temparr[j++] = arr[i];
			}
		}

		temparr[j++] = arr[n - 1];
		for (int i = 0; i < j; i++) {
			arr[i] = temparr[i];
		}
		return j;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the elements");
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		n = removeDuplicates(arr, n);

		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		scan.close();
	}
}
package com.park.algorithms;

public class Main620 {
	public static void main(String[] args) {
		
		
		/*
		 * 
		 * 
@*
@**
@***
@****
@*****
@******

		 * 
		for (int j = 0; j <= 5; j++) {
			System.out.print("@");
			for (int i = 0; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//int n = 5를 받아 별을 출력하시오
		
		int n= 5;
		
		for (int i = 0; i < n; i++) {
			System.out.println("");
			for (int j = 0; j < i+1; j++) {
				System.out.print("*"); 
			}
		}
		
		
	}
}

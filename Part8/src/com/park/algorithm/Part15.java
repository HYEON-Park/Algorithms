package com.park.algorithm;

public class Part15 {
	public static void main(String[] args) {
		//구구단
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d  ", j,i,i*j);
			}
			System.out.println();
		}
	}
}

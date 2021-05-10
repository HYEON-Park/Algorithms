package com.park.algorithm;

public class Part11 {
	public static void main(String[] args) {

		int a = 4;
		// 16 16

		int arr[][] = new int[a][a];

		for (int i = 0; i < a; i++) {
			
			if (i % 2 == 0) {
				for (int j = 0; j < a; j++) {
					arr[i][j] = i * a + j + 1;
				}
			} else {
				for (int j = a-1; j >= 0; j--) {
					arr[i][j] = i * a + a - j;
				}
			}
		}

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}

	}
}

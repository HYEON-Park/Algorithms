package com.park.algorithm;

public class Part12 {
	public static void main(String[] args) {
		
		int a = 4;

		int arr[][] = new int[a][a];
		
		int num = 1;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				arr[j][i] = num;
				num++;
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

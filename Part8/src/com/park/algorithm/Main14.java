package com.park.algorithm;

public class Main14 {
	public static void main(String[] args) {
		
		//입력 된 n수 만큼 n행 n열의 형태로 아래와 같이 출력 되는 숫자 사각형을 출력하시고
//		1  2  3  4
//		2  4  6  8
//		3  6  9  12
//		4  8  12  16
		
		int n = 3;
		
		int arr[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = (i + 1) * (j + 1);
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}

	}

}

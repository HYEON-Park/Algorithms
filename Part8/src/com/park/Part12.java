package com.park;

public class Part12 {
	
	public static int getNum (int i) {
		
		int j = 0;
		
		while (i>0) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9 ) 
				j++;
				i /= 10;
			}
			return j; 
		}
		
	public static void main(String[] args) {

		// 369 게임으로 해당시에 "짝"을 출력하세요

		int n = 100;
		int a = 1;

		for (int i = 1; i <= n; i++) {
			int cnt = getNum(i);

			if (cnt == 0) {
				System.out.print(i + " ");
			} else {
				for (int h = 0; h < cnt; h++) {
					System.out.print("짝");
				}
				System.out.print(" ");
			}
			
		}
	}
	
	
}

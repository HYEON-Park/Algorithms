package com.park.algorithm;

public class Main8 {
	public static void main(String[] args) {
		// 입력 된 수 의 팩토리얼을 구하시오 = 5
		// 5*4*3*2*1 = ?

		int num = 5;
		int one = 1;
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
			one *= i;
		}
		System.out.println(one);
		
		
		/*one = 1;
		for (int i = 1; i >= num; i--) {
			System.out.println(i);
			one *= i;
		}*/
	}
}

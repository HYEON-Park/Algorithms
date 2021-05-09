package com.park.algorithm;

public class Main10 {
	public static void main(String[] args) {
		
		//입력 된  수 만큼의 n행 n열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오
		
		// :4
		//	1 2 3 4
		//	5 6 7 8	//약 이런식
		//	9101112
		//	13141516
		
		int putNum = 5;
		for (int i = 1; i <= putNum*putNum; i++) {
			if (i % putNum == 1) {
				System.out.println();
			}
			System.out.print(i);
		
		}
		
	}
}

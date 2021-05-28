package com.park.algorithm;

public class Part25_2 {
	public static void main(String[] args) {
		

		//더하기 사이클
		//숫자 입력시에 10자리 1자리의 ㅎ합을 구하시오
		
		
		int n = 11;
		int sum = 0;
		
		while (n>0) {
			sum += n % 10;
			n /= 10;
		}
		System.out.println(sum);
		
	}
}

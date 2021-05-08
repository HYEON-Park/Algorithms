package com.park.algorithm;

public class Main9 {
	public static void main(String[] args) {
		//입력 된 수의 각자리 합을 구하시오
		//1232 = 9
		
		int intputNum = 1232;
		int accSum = 0;
		
		while (intputNum > 0) {
			accSum += intputNum % 10;
			intputNum /= 10;
			
		}
		System.out.println(accSum);	
		
	}

}

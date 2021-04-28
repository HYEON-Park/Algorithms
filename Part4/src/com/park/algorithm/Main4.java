package com.park.algorithm;

public class Main4 {
	public static void main(String[] args) {
		//19를 2 진수로 바꾸기
		int inputNum = 19;
		int bin[] = new int[100]; //bin이란 배열은 2진수로 변환 될 때 2진수 값들을 저장할 배열임
		
		//10진수를 2로 계속 나누고 몫이 나오면 그것도 계속 나누기...
//		19 / 2 9  나머지 1	
//		9 / 2 4 나머지 1
//		4 / 2 2 나머지 0
//		2 / 2 1 나머지 0
//		1 / 2 0 나머지 1
		
		int i = 0;
		int mok = inputNum; //처음 목의 값은 inputNum 
		while(mok > 0) { //몫이 0보다 큰 중에 while 반복
			bin[i] = mok % 2;
			mok /= 2; //몫은 2로 나눈 수로 갱신
			i++;
		}
		
		i--;
		for(; i>=0; i--) {
			System.out.print(bin[i]);
		}
		
	}
}

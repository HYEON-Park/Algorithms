package com.park.algorithm;

import java.util.Scanner;

public class Part3 {
	public static void main(String[] args) {
		
	//Q : 가장 많이 출현한 수를 출력하시요
	//12231424682484222461222
	
	//정답 : 2(n회)
	
	Scanner scan = new Scanner(System.in);
	int [] inputNum = new int[10];
	
	for (int i = 0; i < 10; i++) {
		inputNum[i] = scan.nextInt(); //inputNum 배열에 입력받기
	}
	
	//사용자 input
	//1223142243
	
	//최빈수는 2 4번인데...
	//어느숫자가 몇 번 나왔는지 저장할 수 있는 자료구조가 필요함
	//1 :2 //2 :4 //3 :2 //4 :2
	int [] x = new int[10];
	
	//	index > 출현한 수
	//	index 값은 > 출현한 수)가 몇 번 나왔는지 저장하는 용도 
	//1223142243
	for (int i = 0; i < 10; i++) {
		x[inputNum[i]]++;
		//x가 가르키는 inputNum에 들어가는 순서의 i 번째 숫자는 도는 동안 출현한 같은 수는 [] ++ 쌓임.
	}
	
	//최빈수 구하기
	
	int xNum = 0; //최빈수
	int xNumCnt = 0; //최빈수횟수
	
	for (int i = 0; i <10; i++) {
		if (xNumCnt < x[i]) {
			xNumCnt = x[i];
			xNum = i;
		}
	}
	System.out.println("최빈수 " +xNum+ "나온 수" +xNumCnt);

	
	
	
	
	
	
	}
}

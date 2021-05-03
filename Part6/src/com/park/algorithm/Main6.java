package com.park.algorithm;

public class Main6 {
	public static void main(String[] args) {
		//최대공약수를 구하시오
		//	12	18
		// 정답은 6임
		
		int n1 , n2;
		n1 = 12;
		n2 = 18;
		
		
		int small;
		int big;
		
		if (n1 > n2) { //n1이 n2보다 크면
			big = n1;
			small = n2;
		} else { //n2가 n1보다 크면
			big = n2;
			small = n1;
		}
		
		 int gcd = 1; //최대공약수 (초기화)
		 //i가 big이랑 small까지 나누어져야 , 나누어지면 가장 마지막에 나누어진 약수가 최대공약수
		 for(int i = 1 ;  i <= small; i++) {
			 if (big % i == 0 && small % i == 0 )  //big이 i로 나누어 떨어질 때 &면서& small도 i로 나누어 떨어질 때
				gcd = i; // 1,2,3,6 으로 나누어짐 최대는 6임
		}
			System.out.println(gcd);
		 }
		
	}


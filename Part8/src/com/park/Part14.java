package com.park;

public class Part14 {
		public static void main(String[] args) {
			
			//상수는 수를 다른 사람과 다르게 거꾸로 읽는다
			//예를들어 거꾸로 읽은 수가 더 큰 수를 큰 수라 말한다.
			//734 893 = 437
			
			int a = 734;
			int b = 891;
			
			int arrA[] = new int[3]; 
			int arrB[] = new int[3];
			
			int lenA = 0;
			do {
				arrA[lenA] = a % 10;
				a/=10;
				lenA++;
			} while (a>0);
			
			int tranA = 0;
			int mux = 1;
			
			for (int i = arrA.length-1; i >= 0 ; i--) {
				tranA += arrA[i]*mux;
				mux*=10;
			}
			System.out.println(tranA);
		}

}

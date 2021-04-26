package com.park.algorithm;

public class Part2 {
	public static void main(String[] args) {
		
		//피보나치수열 
		//피보나치 수열을 출력해라
		//1 1 2 3 5 8 13....
		int []arr = new int [100];
		
		//an승은  			해당 공식은 n>=3  n이 3부터 해당이 가능
//		An = An-1 + An-2; n>=3 
		
		arr[1] = 1; 
		arr[2] = 1;
		
		for (int i = 3; i < 100; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		
		//2번째 방법 /배열없이 돌리기
		int prevNum = 1; //An-2 
		int pNum = 1; 	//An-1
		System.out.print(prevNum + " ");
		System.out.print(pNum + " ");
		
		for (int i = 3; i <=10; i++) {
			int n = prevNum+pNum;
			System.out.print(n+" ");
			
			prevNum = pNum;

		}
		
				
	}
}

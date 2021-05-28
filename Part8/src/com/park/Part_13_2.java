package com.park;

public class Part_13_2 {
	
	public static void main(String[] args) {
		
		//더하기 사이클
		//숫자 입력시에 10자리 1자리의 ㅎ합을 구하시오
		
		
		int n = 26;
		int res = n;
		int cnt = 0;
		int tmp = 0;
		
		do {
			tmp = res / 10 + res % 10;
			res= res % 10 *10 + tmp % 10;
			cnt++;
		} while (n != res);
		
		System.out.println(cnt);
	}

}

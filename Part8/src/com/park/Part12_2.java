package com.park;

public class Part12_2 {
	/*
	public static int getNum(int i) {
		int j = 0;
		
		while (i>0) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				j++;
				
			}
		}
	}
	*/
	
	public static void main(String[] args) {
		
		
		
	int n = 100;
	int a = 1;
	String d ="짝";
	
	int h = 0;
	for (int i = 1; i <= n ; i++) {
		i *= a;
		
		if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9 ) {
			System.out.println(d);
		
		} else {
			System.out.println(i);
			
		}
	}
	}
}

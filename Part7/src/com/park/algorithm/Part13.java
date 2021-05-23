package com.park.algorithm;

public class Part13 {
	public static void main(String[] args) {
		//팰린드롬 판별하기 
		
		//12321 : true
		
		String n =  "12321"; 
		int len = n.length();
		boolean flag = true;
		for (int i = 0; i < len/2 ; i++) {
			if (n.charAt(i) != n.charAt(len-i-1)) {
				flag = false;
			}
		}
		
		System.out.println(flag);
		
	}
}

package com.park;

public class Part13 {
	public static void main(String[] args) {
		//중복 된 수 제거 
		boolean arr[] = new boolean[10];
		int arri[] = new int[10];
		arri[0] = 2;
		arri[1] = 3;
		arri[2] = 4;
		arri[3] = 4;
		arri[4] = 1;
		arri[5] = 7;
		arri[6] = 4;
		arri[7] = 8;
		arri[8] = 9;
		arri[9] = 0;
		
		for (int i = 0; i <= 10 ; i++) {
			arr[arri[i]] = true;
		}
		for (int i = 0; i <= 10; i++) {
			if (arr[i]) {
				System.out.println(i);
			}
			
		}
		
	}
}

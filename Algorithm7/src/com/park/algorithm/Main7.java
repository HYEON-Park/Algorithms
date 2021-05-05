package com.park.algorithm;

public class Main7 {
	
	public static void main(String[] args) {
		//눈떠보니 코딩테스트 전날 문제 1
		
		//이진수 암호 해독 > 아스키코드로 해독
//		"  + -- + - + -  "
//		"  + --- + - +  "
//		"  + -- + - + -  "
//		"  + - + - + - +  "
		
		String[] text = {
				"  + -- + - + -  ",
				"  + --- + - +  ",
				"  + -- + - + -  ",
				"  + - + - + - +  ",
		};
		solution(text);
		
		
	}

	private static void solution(String[] text) {

		for (int i = 0; i < text.length; i++) {
			int n = Integer.parseInt(text[i].trim().replace(" ", "").replace("+", "1").
					replace("-","0"), 2);
				text[i] = String.valueOf((char)n);
				System.out.println(text[i]);
		}
		
	}
	
}

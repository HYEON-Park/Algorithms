package com.park.algorithm;

public class Main5 {
	public static void main(String[] args) {
		
		//대소문자 변환 
		String input = "helloWorlD";
		
		char []arr;
		arr = input.toCharArray(); 	//문자열 어레이 사용
		System.out.println(arr);	//input 스트링 나옴
		System.out.println();		
		
			//문자 하나하나 다 돌아다니면서 (for) 대소문자로 변환시켜줘야함
		for (int i = 0; i < arr.length; i++) {  	//arr.length 만큼
			if (arr[i] >= 'a' && arr[i] <= 'z') { 	// a 소문자면~~ z   //소문자 -> 대문자
													//소문자a~z << A~Z 소문자 다음 대문자 순서인데 대문자가 소문자보다 더 큼							
				arr[i] = (char) (arr[i] + 'A'-'a'); //if 해당하면 A-a 빼면 / 일정한 문자 어레이의 값이 빠지는거라 대소문자가 변형되는건가봄 
			}
			else if (arr[i] >= 'A' && arr[i] <= 'z') {		//대문자 -> 소문자
					arr[i] = (char) (arr[i] - ('A'-'a'));
			}
			
		}
		
		System.out.println(arr);
	}
}

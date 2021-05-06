package com.park.algorithm;

public class Main7 {
	public static void main(String[] args) {

		// 입력 된 수가 소수인지 판별하시오.
		// : 13

		// 소수 : 자기 자신을 제외하고 나누어 떨어지는 약수가 잇으면 -> 소수가 아님
		// 소수 = 1과 자기자신만 나누어 떨어지는 경우

		int num = 13;

		boolean primeNumQ = true;
		for (int i = 2; i <= num/2; i++) { //자기자신보다 2
			if (num % i == 0) {
				// if문에 해당 될 시에는 primeNum가 아님

				primeNumQ = false; // 그러므로 boolean 사용하여 T/F
			}
		}
		if (primeNumQ) {
			System.out.println(num + " 소수임");
		} else {
			System.out.println(num + " 소수가 아님");

		}

	}
}

package com.park.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student st1 = new Student("김영희", "1682");
		Student st2 = new Student("이철수", "1772");
		Student st3 = new Student("박기영", "1813");

		ArrayList<Student> list = new ArrayList<Student>();

		list.add(st1);
		list.add(st2);
		list.add(st3); // 리스트 생성 / 넣어줌

		// for문으로 확인하기
		/*
		 * for (Student s : list) { System.out.println(s.getName());
		 * System.out.println(s.getNo()); }
		 */
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("검색y, 종료 n 입력하세요 :");
			String input = sc.next();

			if (input.equals("y")) {
				System.out.println("검색 :");
				String name = sc.next();
				boolean flag = false;

				for (Student s : list) {
					if (s.getName().equals(name)) {
						System.out.println("해당 이름이 있습니다." + s.getNo());
						flag = true;
					}
				}
			
				if (!flag) {
					System.out.println("해당하는 학생이름이 없습니다.");
				}
				

			} else if (input.equals("n")) {

				break;
			}
		}
		System.out.println("종료.");

	}
}

package Algorithm_2205.src;

import java.util.Scanner;

class TEST1_Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두번째 정수를 입력해주세요 : ");
        int one = 1;
        int two = sc.nextInt();

        int ans;
        ans = (one + two) * 5;

        System.out.println("답은 :" + ans);
    }
}

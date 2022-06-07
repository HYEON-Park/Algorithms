package Algorithm_2205.src;

import java.util.Scanner;

class SumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력한 n의 1~n의 숫자를 구합니다. n은 : ");

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            // i++; 필요가 없음.
        }

        System.out.println("1부터 n까지의 합은 : " + sum);
    }
}

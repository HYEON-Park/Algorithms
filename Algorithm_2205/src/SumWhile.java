package Algorithm_2205.src;

import java.util.Scanner;

class SumWhile { // p.27
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구하시오");
        System.out.println("n의 값 : ");
        int n = sc.nextInt();

        int sum = 0; // 합
        int i = 1;

        while (i <= n) { // n이 1이하면 반복합니다.
            sum += i;
            i++;
        }

        System.out.println("1부터 " + n + "까지의 합 : " + sum);
    }

}

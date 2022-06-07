package Algorithm_2205.src;

import java.util.Scanner;

class SumForPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do { // do 하고
            System.out.println("n의값 : ");
            n = sc.nextInt();
        } while (n <= 0);

        int sum = 0;

        for (int i = 1; i <= n; i++)
            sum += i;

        System.out.println("합  : " + sum);

    }
}

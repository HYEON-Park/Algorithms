package Algorithm_2205.src;

import java.util.Scanner;

class SumWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 입력한 정수까지의 합을 구할거임  n은 ? :");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (n >= i) {
            sum += i;
            System.out.println(i);
            i++;
        }

        System.out.println("합은 : " + sum);
    }
}

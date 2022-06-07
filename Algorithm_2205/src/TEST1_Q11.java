package Algorithm_2205.src;

import java.util.Scanner;

class TEST1_Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("양수 입력 :");
        int a;
        do {
            a = sc.nextInt();
        } while (a < 0);

        if (a >= 100)
            System.out.println("3 자리임");
        else if (a >= 1000)
            System.out.println("4자리임");
        else {
            System.out.println("3자리도 4자리도 아님");
        }

    }
}

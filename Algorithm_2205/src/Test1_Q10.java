package Algorithm_2205.src;

import java.util.Scanner;

class Test1_Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a :");
        int a = sc.nextInt();
        int b;
        do {
            System.out.println("b :");
            b = sc.nextInt();
        } while (a >= b);

        int m = b - a;

        System.out.println("답 : " + m);

    }
}

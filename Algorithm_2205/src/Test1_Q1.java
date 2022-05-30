import java.util.Scanner;

public class Test1_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 4개입1력");
        System.out.println("a :");
        int a = sc.nextInt();
        System.out.println("b :");
        int b = sc.nextInt();
        System.out.println("c :");
        int c = sc.nextInt();
        System.out.println("d :");
        int d = sc.nextInt();

        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;

        System.out.println("최댓값은 " + max);
    }
}

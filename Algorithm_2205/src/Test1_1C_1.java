import java.util.Scanner;

class Test1_1C_1 {
    static int middle(int a, int b, int c) {
        // 3개의 인수중에 중앙값 구하기
        if (a >= b) // a b
            if (b >= c) // b c
                return b;
            else if (a <= c) // c a b
                return a;
            else
                return c;
        else if (a > c) // b a c
            return a;
        else if (b > c) // b c a
            return c;
        else // c b a
            return b;

    }

    // c b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 3개 입력 >>");
        System.out.println("b:");
        int a = sc.nextInt();
        System.out.println("a:");
        int b = sc.nextInt();
        System.out.println("c:");
        int c = sc.nextInt();

    }
}

package Algorithm_2205.src;

import java.util.Scanner;

class SeqSearch {
    // 요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색합니다.
    // 입력배열, 입력한배열크기, 서치수
    static int SeqSearch(int[] a, int n, int key) {
        int i = 0;

        // while (true) {
        // if (i == n) {
        // return -1;
        // }
        // if (a[i] == key) {
        // return i;
        // }
        // i++;
        // }

        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                return i; // 해당값이 있다면 그 값을 반환
            } else {
                return -1; // 해당하는 값이 없을 경우 -1을 반환
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요솟수 : ");

        int num = sc.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "]:");
            x[i] = sc.nextInt();
        }
        System.out.println("검색할 값 : ");
        int ky = sc.nextInt();
        int idx = SeqSearch(x, num, ky);

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky + " 이 " + idx + " 에 있습니다.");
    }
}

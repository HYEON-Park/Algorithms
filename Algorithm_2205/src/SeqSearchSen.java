package Algorithm_2205.src;

import java.util.Scanner;

//보초법
class SeqSearchSen {
    // 요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형검색합니다.
    static int SeqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key; // 보초를 (무조건) 추가

        while (true) {
            if (a[i] == key) // 배열에 검색한수 가있으면
                break;
            i++;
        }
        return i == n ? -1 : i; // 삼항연산자
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        System.out.println("검색할 값 : ");
        int ky = sc.nextInt();

        int idx = SeqSearchSen(x, num, ky);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없음");
        } else {
            System.out.println(ky + " x[" + idx + "] 에 있습니다.");
        }

    }

}

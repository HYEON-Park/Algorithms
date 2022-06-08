package Algorithm_2205.src;

public class finalize {
    public static void main(String[] args) {
        Counter counter = null;
        for (int i = 1; i <= 50; i++) {
            counter = new Counter(i);

            counter = null;
            System.gc(); // 쓰레기 수집기 실행 요청
        }
    }
}

// 참조하지 않는 배열이나 객체는 GC가 힙영역에서 자동적으로 소멸시킨다.
// 쓰레기 수집기는 객체를 소멸하기 직전에 마지막으로 객체의 소멸자finalize()를 실행한다.

// 객체가 소멸 될 때 finalize가 실행되는 것을 확인할 수 있음.

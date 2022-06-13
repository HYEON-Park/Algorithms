package Algorithm_2205.src;

public class CalcThread extends Thread {
    public CalcThread(String name) {
        setName(name);
    }

    public void run() { // 쓰레드가 실행할 내용
        for (int i = 0; i < 200000000; i++) {

        }
        System.out.println(getName());
    }
}

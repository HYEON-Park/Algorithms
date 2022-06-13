package Algorithm_2205.src;

public class PriorityExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread thread = new CalcThread("name");
        }
    }
}

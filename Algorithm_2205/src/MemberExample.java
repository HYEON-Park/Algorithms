package Algorithm_2205.src;

public class MemberExample {
    public static void main(String[] args) {

        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if (obj1.equals(obj2)) // equals 한지 확인하기
        {
            System.out.println("obj1과 obj2는 동등합니다.");
        } else {
            System.out.println("obj1과 obj2는 '안'동등합니다.");
        }

        if (obj1.equals(obj3)) // equals 한지 확인하기
        {
            System.out.println("obj1과 obj3 동등합니다.");
        } else {
            System.out.println("obj1과 obj3 '안'동등합니다.");
        }

    }
}
package Part9.src;

public class java_10_1 {
    // 자바의 정석 _ 10 _ 예외처리 , Exception 처리
    // Exception / Runtime Exception
    // Exception 일반 예외는 Exception을 상속 받지만 Runtime Exception을 상속받지 않는 클래스
    // 실행예외 RuntimeException을 '상속'받는 클래스 > 상속받는 여부를 보고 실행 예외를 판단한다.

    // NullPointerException / java.lang.NullPointerException
    // 객체참조가 없는 상태 . 즉 null 값을 갖는 참조 변수로 객체접근 연산자인 도트를 사용했을 때 발생
    // 객체가 없는 상태에서 객체사용을 하려고 하니 예외가 발생함

    // ArrayIndexOutOfBoundsException
    // 배열에서 인덱스 범위를 초과해서 사용 실행 예외인 java.lang.ArrayIndexOutOfBoundsException

    // NumberFormatException
    // 문자열을 숫자 데이터로 변경하는 경우의 > 숫자로 변환될 수 없는 문자가 포함 되었다면
    // java.lang.NumberFormatException
    // EX : String num = "no001231" > no는 숫자변환 안됨.

    // ClassCastException
    //

}

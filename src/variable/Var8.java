package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32767 ~ 32767
        int i = 2147483647; // 기본 사용
        long l = 9223372036854775807L; // 마지막에 L 붙여줘야 함

        // 실수
        float f = 10.0f; // 마지막에 f 붙여줘야 함
        double d = 10.0; // float 보다 큰 범위, 기본 사용

        // 메모리를 작게 사용하면 작은 숫자를 표현할 수 있고, 메모리를 많이 사용하면 큰 숫자를 표현할 수 있다.
        // 변수를 선언하면 표현 범위에 따라 메모리 공간을 차지한다.

        // boolean
        boolean bool = false;

        // char
        char c = 'A';

        // String
        // 메모리 사용량은 문자 길이에 따라 동적으로 달라진다.
        String str = "hello";
    }
}

/*
 * 실무에서 거의 사용하지 않는 타입
 * - byte, short, float, char
 * - 메모리 용량은 매우 저렴하다. 따라서 메모리 용량을 약간 절약하기 보다는 개발 속도나 효율에 초점을 맞추는 것이 더 효과적이다.
 *
 * 실무에서 자주 사용하는 타입
 * - int, long, double, boolean, String
 */

/*
 * 변수 이름 규칙
 * - 변수 이름은 숫자로 시작할 수 없다.
 * - 이름에는 공백이 들어갈 수 없다.
 * - 자바의 예약어를 변수 이름으로 사용할 수 없다. (int, class, public 등)
 * - 변수 이름에는 영문자, 숫자, 달러 기호, 밑줄만 사용할 수 있다.
 *
 * 변수 이름 관례
 * - 소문자로 시작하는 낙타 표기법(camel case)
 * - ex) orderDetail
 *
 * 클래스는 대문자, 나머지는 소문자로 시작한다. (+ 카멜케이스)
 * 상수는 모두 대문자를 사용하고 언더바로 구분한다. (ex. USER_INFO)
 * 패키지는 모두 소문자를 사용한다. (ex. org.spring.boot)
 */
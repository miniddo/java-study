package variable;

public class Var7 {
    public static void main(String[] args) {
        int a = 100; // 정수
        double b = 10.5; // 실수
        boolean c = true; // 불리언(boolean) true, false
        char d = 'a'; // 문자 하나, 작은 따옴표
        String e = "hello java"; // 문자열, 문자열을 다루기 위한 특별한 타입, 큰 따옴표

        // int f = "백원"; // 컴파일 오류 java: incompatible types: java.lang.String cannot be converted to int

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}

// 코드에서 개발자가 직접 적은 100, 10.5, true 등을 리터럴(literal)이라고 부른다. = 고정된 값
// 변수의 값은 변할 수 있지만, 리터럴 자체는 변하지 않는다.
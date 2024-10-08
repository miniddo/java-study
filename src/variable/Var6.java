package variable;

public class Var6 {
    public static void main(String[] args) {
        // 변수는 초기화해야 한다.
        // 지역 변수는 개발자가 직접 초기화를 해주어야 한다.
        // 클래스 변수와 인스턴스 변수는 자바가 자동으로 초기화를 진행해준다. (추후 학습)
        int a;
        // System.out.println(a); // Variable 'a' might not have been initialized (컴파일 에러 발생)
        // 컴파일 에러: 자바 문법에 맞지 않았을 때 발생하는 에러

        // 해당 상태에서 컴파일 하면 out 폴더에는 int a;는 삭제되어 있음 (불필요한 코드 삭제)
    }
}

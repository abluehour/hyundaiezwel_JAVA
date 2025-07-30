package oopClass.sec12;

public class CalMain {
    public static void main(String[] args) {
        // Calculator 클래스의 static 멤버로만 이루어진 클래스
        //객체인스턴스 멤버가 없으므로 객체 생성이 필요없음
        double result1 = 10*10*Calculator.pi; //클래스를 통해서 접근
        int result2 = Calculator.pulus(10, 20); //클래스를 통해서 접근
        int result3 = Calculator.minus(20, 10); //클래스를 통해서 접근
    }
}

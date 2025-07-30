package oopClass.sec10;

public class TestMain {
    public static void main(String[] args) {
        // Test 클래스의 인스턴스 생성
        Test test = new Test();
        test.width = 5; // 인스턴스 변수에 값 할당
        test.height = 10; // 인스턴스 변수에 값 할당
        test.area(); // 인스턴스 메서드 호출

        // static 멤버에 값 할당
        Test.width1 = 15;
        Test.height1 = 20;
        Test.area1(); // static 메서드 호출

        // static 멤버는 클래스 이름으로도 접근 가능
        System.out.println("static 멤버의 면적: " + (Test.width1 * Test.height1));
    }
}

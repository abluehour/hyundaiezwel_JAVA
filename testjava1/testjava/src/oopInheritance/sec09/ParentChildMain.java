package oopInheritance.sec09;

public class ParentChildMain {
    public static void main(String[] args) {
        Child child = new Child();

        //자동 타입변환과 다형성
        //부모 클래스 타입의 참조변수 선언
        Parent parent;
        //Parent 타입 객체 인스턴스 참조를 Child 타입의 인스턴스 연결
        parent = child; // 자동 타입 변환 -> subclass의 객체가 superclass의 객체로 변환됨
        //parent 변수는 child 객체 참조하지만
        //사용 가능한 멤버는 Parent 클래스의 멤버만 사용 가능
        parent.method1(); // Parent 클래스의 메서드 호출

        //parent.method3(); // Parent 클래스에 없는 메서드 호출 시도 - 컴파일 에러 발생

        //예외적으로 subclass가 superclass의 메서드를 오버라이딩 했으면 subclass의 메소드가 호출 되게 됨
        parent.method2(); // subclass 클래스의 오버라이딩된 메서드 호출
    }
}

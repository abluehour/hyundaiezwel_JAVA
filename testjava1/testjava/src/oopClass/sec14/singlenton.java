package oopClass.sec14;

public class singlenton {
    // 싱글톤 패턴 : 클래스의 인스턴스가 오직 하나만 생성되도록 보장하는 디자인 패턴
    // 주로 애플리케이션 내에서 객체가 하나만 생성되도록 하는 것

    // 자기자신 클래스 타입으로 static 필드 선언
    private static singlenton instance = new singlenton();

    // 생성자를 private로 선언하여 외부에서 인스턴스를 생성하지 못하도록 함
    private singlenton() {
    }
    static singlenton getInstance() {
        // 클래스의 인스턴스를 반환하는 정적 메서드
        // 이 메서드를 통해서만 인스턴스를 가져올 수 있음
        return instance;
    }

}

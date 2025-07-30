package oopClass.sec14;

public class singleMain {
    public static void main(String[] args) {
        // 싱글톤 패턴을 사용하는 클래스의 인스턴스를 가져오는 메서드 호출
        // singlenton obj1 = new singlenton(); // 오류 발생: 생성자가 private로 선언되어 있어 직접 인스턴스 생성 불가

        // 싱글톤 패턴을 사용하는 클래스의 인스턴스를 가져옴
        singlenton instance1 = singlenton.getInstance();
        singlenton instance2 = singlenton.getInstance();

        // 두 인스턴스가 동일한 객체인지 확인
        if (instance1 == instance2) {
            System.out.println("instance1과 instance2는 동일한 객체입니다.");
        } else {
            System.out.println("instance1과 instance2는 다른 객체입니다.");
        }
    }
}

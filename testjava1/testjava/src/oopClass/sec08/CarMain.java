package oopClass.sec08;

public class CarMain {
    public static void main(String[] args) {
        // 사용자 정의 클래스 사용
        // 1. Car 클래스의 객체 생성
        // 2. 생성된 객체 통해서 멤버 변수나 멤버 메소드 사용(사용자 접근제한에 따라 다름)
        Car c = new Car(); // Car 클래스의 객체 생성
        // c인스턴스 생성

        // 객체를 통해서 멤버 변수 또는 멤버 메소드 사용
        //c.carNo = "22가1234"; // carNo는 private이므로 직접 접근 불가

        //객체를 통해서 public 메소드 호출
        c.setCarInfo("11가1111", "k7", "기아", "2025","1500"); // 멤버 변수 값 초기화
        c.showCarInfo(); // 멤버 변수 값 출력

        // Car 클래스 인스턴스 b 생성
        Car b = new Car(); // Car 클래스의 또 다른 객체 생성
        b.setCarInfo("22나2222","그랜저", "현대","2025","3000"); // 멤버 변수 값 초기화
        b.showCarInfo(); // 멤버 변수 값 출력



    }
}

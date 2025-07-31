package inerfacepkg.sec01;

public class SmartPhonMain {
    public static void main(String[] args) {
        // interface 사용
        // SmartPhone 인터페이스를 구현한 Phone 클래스의 인스턴스 생성
        SamsungPhone sPhone = new SamsungPhone();

        // Phone 클래스의 메서드 호출
        sPhone.sendCall();



        // interface의 참조변수 사용
        Ismartphone isamsungphon = new SamsungPhone(); // 구현 클래스 객체 참조
        isamsungphon.sendCall(); // 인터페이스 메서드 호출

        //interface의 참조변수로 구현 클래스의 메서드 호출
        Ismartphone iiphone = new Iphone();
        iiphone.sendCall(); // 인터페이스 메서드 호출


    }
}

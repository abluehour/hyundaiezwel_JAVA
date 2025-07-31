package inerfacepkg.sec01;

public interface Ismartphone {
        //생성자가 없는 inerface이므로 선언할 때 초기화 해야 함 : 상수
        //상수 필드
        String name = "smartphopone"; // 인터페이스 내의 필드는 자동으로 public static final로 간주됨
        //구현되는 클래스의 메소드 설계도

        // 추상메서드 : body가 없는 메서드 선언
        // 객체가 갖고 있을 메서드를 설병하는 부분 (접근제한, 반환타입, 메서드명, 매개변수)
        public void sendCall();
        public void receiveCall();
        public void sendSMS();
        public void receiveSMS();

}

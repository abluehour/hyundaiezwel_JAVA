package inerfacepkg.sec01;

public class SamsungPhone implements Ismartphone{
    //클래스가 inerface를 구현한다고 설정되면(implements) interface의 모든 정의된 메서드를 재정의 해야함
    //클래스 이므로 클래스가 갖는 필드, 매서드 추가 가능

    String name; // 스마트폰 이름

    public SamsungPhone(){
        name = "삼성폰"; // 생성자에서 스마트폰 이름 초기화
    }

    @Override
    public void sendCall(){
        System.out.println(name + "에서 전화를 겁니다.");
    }

    @Override
    public void receiveCall(){
        System.out.println(name + "에서 전화를 받습니다.");
    }

    @Override
    public void sendSMS(){
        System.out.println(name + "에서 문자를 보냅니다.");
    }

    @Override
    public void receiveSMS(){
        System.out.println(name + "에서 문자를 받습니다.");
    }

}

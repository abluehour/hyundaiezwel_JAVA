package inerfacepkg.sec01;

public class Iphone implements Ismartphone{
    String name;

    public Iphone (){
        name = "아이폰";
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

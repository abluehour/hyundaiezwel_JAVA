package inerfacepkg.sec03;

public class SmartRemoteControlMain {
    public static void main(String[] args) {

        //2개 인터페이스의 기능 구현한 클래스 통해서 기능 확인
        SmartTelevision smartTv = new SmartTelevision();
        smartTv.turnOn(); // SmartTelevision 클래스의 turnOn 메서드 호출
        smartTv.setVolume(7); // SmartTelevision 클래스의 setVolume 메서드 호출
        smartTv.search("www.example.com"); // SmartTelevision 클래스의 search 메서드 호출

        //interface 활용
        //RemoteControl remoteControl = new SmartTelevision(); //
        Isearchable searchable = new SmartTelevision();
        searchable.search("www.example.com");


    }
}

package inerfacepkg.sec02;

public class RemoteControlMain {
    public static void main(String[] args) {
        //인터페이스 활용 객체와 통신
        RemoteControl rc = null;

        //Television 클래스의 인스턴스를 생성
        rc = new Television();
        //인터페이스의 메서드 호출
        rc.turnOn(); // TV를 켭니다.
        rc.setVolume(10); // TV 볼륨을 10으로 설정합니다.
        rc.setMute(true); // TV 음소거 설정 //디폴트 메서드지만 재정의 되었음(Television에서 재정의된 메서드가 호출)

        System.out.println("--------------------");

        //Audio 클래스의 인스턴스를 생성
        rc = new Audio();
        //인터페이스의 메서드 호출
        rc.turnOn(); // 오디오를 켭니다.
        rc.setVolume(5); // 오디오 볼륨을 5로 설정합니다.
        rc.setMute(false); // 오디오 음소거 해제 //디폴트 메서드지만 재정의 되었음(Audio에서 재정의된 메서드가 호출)


        //정적 메서드 사용
        RemoteControl.changeBattery();
        //rc.showRemote(); //인터페이스에 정의된 showRemote() 메서드는 없으므로 호출 불가

    }
}

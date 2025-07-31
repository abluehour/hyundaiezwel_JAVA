package inerfacepkg.sec03;

public class SmartTelevision implements Isearchable, RemoteControl {
    private int volume; //인스턴스 멤버필드

    public SmartTelevision() {
        this.volume = 0; //초기화
    }
    @Override
    public void search(String url) {
        System.out.println("웹에서 " + url + "을(를) 검색합니다.");
    }
    @Override
    public void turnOn() {
        System.out.println("스마트 TV를 켭니다.");
    }
    @Override
    public void turnOff() {
        System.out.println("스마트 TV를 끕니다.");
    }
    @Override
    public void setVolume(int volume) {
        if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("스마트 TV 볼륨: " + this.volume);
    }



}

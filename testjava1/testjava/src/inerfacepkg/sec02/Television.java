package inerfacepkg.sec02;

public class Television  implements RemoteControl {
    private int volume;
    private boolean mute;

    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }

    //interface default method도 필요하면 재정의 가능(선택사항)
    @Override
    public void setMute(boolean mute) {
        this.mute = mute;
        if (this.mute) {
            System.out.println("TV 음소거");
        } else {
            System.out.println("TV 음소거 해제");
        }
    }


}

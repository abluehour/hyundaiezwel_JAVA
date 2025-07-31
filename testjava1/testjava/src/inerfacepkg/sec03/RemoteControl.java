package inerfacepkg.sec03;

public interface RemoteControl {
    //상수 필드 선언 : public static final은 자동으로 컴파일러에 의해 추가
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //추상메서드 선언 : public abstract 자동으로 컴파일러에 의해 추가
    void turnOn(); // 리모컨 전원 켜기
    void turnOff(); // 리모컨 전원 끄기
    void setVolume(int volume); // 리모컨 볼륨 설정

    //디폴트 메서드 선언 및 구현 : public 자동으로 컴파일러에 의해 추가
    //default 키워드를 반드시 붙여야 함 = 접근제한자가 아님
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("리모컨 음소거 기능 켬");
        } else {
            System.out.println("리모컨 음소거 기능 끔");
        }
    }
}

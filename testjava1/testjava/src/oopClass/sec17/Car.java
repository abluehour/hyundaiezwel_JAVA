package oopClass.sec17;

public class Car {
    //private 멤버 필드 이므로 인스턴스로 통한 접근이 불가능
    private int speed; // 현재 속도
    private boolean stop; // 정지 여부

    //private 멤버 필드에 접근 하려면 클래스 내에서 접근 해야함
    //private 멤버필드의 값을 수정하기 위한 setter와 멤버필드 값을 참조하기위한 getter가 필요함

    public void setSpeed(int speed) {
        // 멤버 필드에 값 저장
        this.speed = speed;
    }

    //getter 메소드
    public int getSpeed() {
        // 멤버 필드의 값을 반환
        return speed;
    }

    public void setStop(boolean stop) {
        // 멤버 필드에 값 저장
        this.stop = stop;
    }

    //getter 메소드

    public boolean isStop() {
        // 멤버 필드의 값을 반환
        return stop;
    }

}

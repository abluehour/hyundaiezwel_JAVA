package oopClass.sec05;

class Tv { //클래스 접근제한 생략 : default(동일 패키지 내에서 접근 가능)
    String color; //접근제한 생략 : default(동일 패키지 내에서 객체 통한 접근 가능)
    boolean power;
    int channel;

    //Tv 기능
    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}
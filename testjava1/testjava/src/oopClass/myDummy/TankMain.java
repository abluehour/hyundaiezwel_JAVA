package oopClass.myDummy;

public class TankMain {
    public static void main(String[] args) {
        // Tank 객체 생성
        Tank t1 = new Tank("K1", true, 50, 30);
        Tank t2 = new Tank();

        t2.setTank("K2", false, 60, 40);

        System.out.println("** 탱크 정보 **");
        t1.showInfo();
        t2.showInfo();

        // 공격모드
        System.out.println("** 공격모드 **");
        t1.modeChange();
        t2.modeChange();

        System.out.println("** 탱크 정보 **");
        t1.showInfo();
        t2.showInfo();



    }
}

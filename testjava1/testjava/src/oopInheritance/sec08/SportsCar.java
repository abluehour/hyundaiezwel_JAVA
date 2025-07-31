package oopInheritance.sec08;

public class SportsCar extends MyCar {
    @Override
    public void speedUp(int speed) {
        this.speed += 10;
    }

    @Override
    public void stop() {
        System.out.println("스포츠카를 멈춤");
        speed = 0;
    }

    public static void main(String[] args) {
        SportsCar myCar = new SportsCar();
        myCar.speedUp(10); // 속도를 증가시킴
        System.out.println("현재 속도: " + myCar.speed);
        myCar.stop();
        System.out.println("현재 속도: " + myCar.speed);
    }
}

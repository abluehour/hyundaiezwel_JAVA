package oopClass.sec18;

public class DriverMain {
    public static void main(String[] args) {
        // 매개변수 다형성
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        //오버라이딩 된 자식클래스의 run() 메서드가 실행됨
        driver.drive(taxi); // Taxi 객체를 매개변수로 전달하여 실행 -> vechicle 타입의 매개변수가 받음(자동 타입 변환 발생)
        driver.drive(bus); // Bus 객체를 매개변수로 전달하여 실행


    }
}

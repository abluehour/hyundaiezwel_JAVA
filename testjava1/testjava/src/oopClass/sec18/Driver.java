package oopClass.sec18;

public class Driver {
    public void drive(Vehicle vehicle) {
        // Vehicle 타입의 매개변수를 받는 메서드
        // Vehicle 타입의 객체를 매개변수로 받아서 실행
        vehicle.run(); // 다형성: Vehicle 타입의 객체를 매개변수로 받아서 실행
    }
}

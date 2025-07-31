package oopInheritance.sec07;

public class Car {
	String carNo, carName, carMaker;
	int carYear;

	// 생성자: 객체가 생성될 때 호출되는 메소드
	public Car(String carNo, String carName, String carMaker, int carYear) {
		this.carNo = carNo;
		this.carName = carName;
		this.carMaker = carMaker;
		this.carYear = carYear;
	}
}

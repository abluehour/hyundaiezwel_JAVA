package oopInheritance.EX01;

public class Car {
    private String carNo;
    private String carName;
    private String carMaker;
    private int carYear;

    //생성자
    public Car(String carNo, String carName, String carMaker, int carYear) {
        this.carNo = carNo;
        this.carName = carName;
        this.carMaker = carMaker;
        this.carYear = carYear;
    }


    @Override
    public String toString(){
        return "차량 번호 : " + this.carNo + "\n" +
                "차종 : " + this.carName + "\n" +
                "제조사 : " + this.carMaker + "\n" +
                "연식 : " + this.carYear + "\n";
    }

}

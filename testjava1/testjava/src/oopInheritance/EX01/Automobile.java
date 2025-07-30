package oopInheritance.EX01;

public class Automobile extends Car{
    private String autoManual;

    public Automobile(String no, String name, String maker, int year, String autoManual) {
        super(no, name, maker, year); // 부모 클래스 Car의 생성자를 호출
        this.autoManual = autoManual; // 자식 클래스 Automobile의 필드 초기화
    }

    @Override
    public String toString() {
        return super.toString() + "기어변속 :" + autoManual; // 부모 클래스의 toString 결과에 자식 클래스의 필드 추가
    }



}

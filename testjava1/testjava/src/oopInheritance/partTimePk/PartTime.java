package oopInheritance.partTimePk;

public class PartTime extends Worker {
    private int hours;
    private int unitPrice;

    //파트타임 직원 한명의 정보등(이름, 주민번호, 근무시간, 시급)을 저장가능해야 함 - 인스턴스 생성 시 직원 벙보 저장
    public PartTime (String name,String joominNo, int hours, int unitPrice) {
        super(name, joominNo); // 부모 클래스 Worker의 생성자를 호출하여 이름과 주민번호를 초기화
        this.hours = hours; // 파트타임 직원의 근무시간 초기화
        this.unitPrice = unitPrice; // 파트타임 직원의 시급 초기화
    }

    public int calculatePay() {
        return hours * unitPrice; // 근무시간과 시급을 곱하여 급여 계산
    }

    @Override
    public String toString() {
        return super.toString() + "\n근무시간: " + hours + "시간\n시급: " + unitPrice + "원\n총지불액: " + calculatePay() + "원";
    }
}

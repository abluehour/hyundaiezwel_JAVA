package oopInheritance.partTimePk;

public class PartTimeMain {
    public static void main(String[] args) {
        System.out.println("=== 파트타임 직원 정보 ===");
        // PartTimeEmployee 클래스의 인스턴스 생성

        PartTime employee = new PartTime("문채형", "000404-4059648",60 ,10000);
        // toString 메서드를 호출하여 직원 정보를 출력
        System.out.println(employee);
    }
}

package oopClass.sec15;

public class Person {
    // final : 초기화 되면 수정할 수 없는 필드
    // final 필드는 객체가 생성될 때 반드시 초기화되어야 하며, 이후에는 값을 변경할 수 없음
    final String nation = "대한민국"; // 상수 필드
    String name; // 이름 필드
    final String ssn; // 주민등록번호 필드 (final로 선언하여 초기화 후 변경 불가)

    public Person(String nation, String ssn) {
        // 생성자에서 final 필드 nation을 초기화
        //this.nation = nation; // nation은 상수이므로 변경할 수 없음
        this.ssn = ssn; // ssn은 final로 선언되어 초기화 후 변경할 수 없음
    }
}

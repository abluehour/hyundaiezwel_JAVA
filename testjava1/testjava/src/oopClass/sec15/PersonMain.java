package oopClass.sec15;

public class PersonMain {
    public static void main(String[] args) {
        // Person 객체 생성
        Person person1 = new Person("대한민국", "123456-7890123");

        System.out.println(person1.nation);
        System.out.println(person1.name);
        System.out.println(person1.ssn);

        person1.name = "홍길동"; // 이름 필드는 변경 가능
        //person1.nation = "한국"; // nation은 final로 선언되어 변경 불가, 오류 발생
        //person1.ssn = "987654-3210987"; // ssn은 final로 선언되어 변경 불가, 오류 발생
    }
}

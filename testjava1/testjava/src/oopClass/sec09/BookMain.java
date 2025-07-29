package oopClass.sec09;

public class BookMain {
    public static void main(String[] args) {
        // 객체 인스턴스 생성
        Book bk = new Book("자바의 정석", "남궁성", 30000);
        Book bk1 = new Book(); // 정해진 기본값으로 멤버필드에 값을 초기화 하는

        bk.showInfo();
        bk1.showInfo();
    }
}

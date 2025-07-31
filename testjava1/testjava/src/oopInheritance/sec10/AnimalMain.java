package oopInheritance.sec10;

public class AnimalMain {
    public static void main(String[] args) {
        //자동 타입 변환 사용가능 멤버 예외 예제
        //Animal 클래스의 인스턴스 생성

        Animal ani;
        ani = new Animal(); // Animal 클래스의 인스턴스 생성
        ani.show(); // Animal 클래스의 eat 메서드 호출
        ani.sound(); // Animal 클래스의 sound 메서드 호출

        //자동 타입 변환을 이용한 서브 클래스 인스턴스 생성
        //Animal 클래스의 참조 변수에 Cat 클래스의 인스턴스를 대입
        ani = new Cat(); // Cat 클래스의 인스턴스 생성
        ani.show(); // Cat 클래스의 eat 메서드 호출
        ani.sound(); // Cat 클래스의 sound 메서드 호출

        //Animal 클래스의 참조 변수에 Dog 클래스의 인스턴스를 대입
        ani = new Dog(); // Dog 클래스의 인스턴스 생성
        ani.show(); // Dog 클래스의 eat 메서드 호출
        ani.sound(); // Dog 클래스의 sound 메서드 호출
        // 위의 코드는 Animal 클래스의 참조 변수 ani를 사용하여
        // Cat 클래스와 Dog 클래스의 인스턴스를 생성하고,
        // 각각의 eat 메서드와 sound 메서드를 호출하는 예제입니다.


        // 아래 코드는 주석 처리되어 있지만, 주석을 해제하면
        // Cat 클래스와 Dog 클래스의 인스턴스를 생성하고,
        // 각각의 eat 메서드와 sound 메서드를 호출하는 예제입니다.
        // 주석을 해제하면 아래 코드도 실행할 수 있습니다.


        //Animal Cat = new Cat();
        //Cat.show(); // Cat 클래스의 eat 메서드 호출
        //Cat.sound(); // Cat 클래스의 sound 메서드 호출
        //
        //Animal Dog = new Dog();
        //Dog.show(); // Dog 클래스의 eat 메서드 호출
        //Dog.sound(); // Dog 클래스의 sound 메서드 호출
    }
}

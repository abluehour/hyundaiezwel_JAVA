package oopInheritance.sec02;

class A {
    public A() { // 올바른 생성자 선언
        System.out.println("A 생성자 호출됨");
    }
}

class B extends A {
    public B() {
        System.out.println("B 생성자 호출됨");
    }
}

class C extends B {
    public C() {
        System.out.println("C 생성자 호출됨");
    }
    public C(int x) {
        super(); // 상위 클래스 B의 생성자를 호출
        System.out.println("C 생성자 호출됨, x: " + x);
    }
}


public class SuperConstTest {
    public static void main(String[] args) {
        C c = new C(); // C 생성자를 호출하면 상위 클래스인 A, B 생성자도 순서대로 호출됨

        // C클래스 인스턴스 생성 - 매개변수가 있는 생성자 메소드 사용
        C c1 = new C(10); // C 생성자 호출, 매개변수 x에 10이 전달됨

    }
}
package inerfacepkg.sec04;

public class MultiExtendsMain {
    public static void main(String[] args) {
        // interface 사용
        ImplementationC c = new ImplementationC(); //구현 클래스 객체 생성

        //InterfaceA :  c 참조 변수는 InterfaceA타입으로 자동 형 변환
        InterfaceA ia = c; // InterfaceA의 메서드 호출
        ia.methodA();

        //InterfaceB :  c 참조 변수는 InterfaceB타입으로 자동 형 변환
        InterfaceB ib = c; // InterfaceB의 메서드 호출
        ib.methodB();

        //InterfaceC
        InterfaceC ic = c; // InterfaceC의 메서드 호출
        ic.methodA();
        ic.methodB();
        ic.methodC();

    }
}

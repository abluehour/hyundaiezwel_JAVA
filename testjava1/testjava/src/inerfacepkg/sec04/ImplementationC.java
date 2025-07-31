package inerfacepkg.sec04;

public class ImplementationC implements InterfaceC, InterfaceA, InterfaceB {
    //Interface가 상속받은 InterfaceA와 InterfaceB의 메서드를 모두 구현해야 함

    @Override
    public void methodA() {
        System.out.println("ImplementationC-methodA() 실행");
    }
    @Override
    public void methodB() {
        System.out.println("ImplementationC-methodB() 실행");
    }
    @Override
    public void methodC() {
        System.out.println("ImplementationC-methodC() 실행");
    }

}

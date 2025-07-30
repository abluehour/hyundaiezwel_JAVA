package oopClass.sec13;

public class StaticBlock {
    //static 블록 - static 멤버만 모아놓은 영역, 모든 static 멤버가 영역에 무조건 있어야 하는건 아님
    //인스턴스 필드와 메서드
    int a;
    void method(){}

    static int staticA;
    static void staticMethod() {
        System.out.println("static 메서드");
    }

    //static 블록
    static {
        int b=1;
        //method(); //인스턴스 메서드 사용 불가
        staticA = 10;
        staticMethod();
    }

    {//인스턴스 필드는 대부분 생성자 통해서 초기화 이루어지기 때문에 초기화 블럭을 사용하지 않는다
        int a1 =10;
        int b1 = 20;
    }


    static{ //static 핑드의 선언과 초기화는 static 블럭을 이용함
        int c=0;
        double bc = 0.5;
    }

}


package oopInheritance.sec11;

public class Dog extends Animal {
    @Override
    public void show(){
        System.out.println("강아지입니다.");
    }

    @Override
    public void sound(){
        System.out.println("멍멍");
    }

    // 강아지 클래스에만 있는 메소드
    public void dogMethod(){
        System.out.println("강아지 메소드입니다.");
    }

}


package oopInheritance.sec12;

public abstract class DrawingObject {
    //추상클래스: 추상메서드를 포함하는 클래스
    //맴버필드 /맴버메서드/ 생성자 포함가능
    public String penColor;

    //추상메서드 - draw 메서드는 자식클래스에서 구현해서 사용할 것
    //메서드명, 접근제한, 리턴타입은 정해주고

    public abstract void draw(); // 추상메서드: 구현부가 없는 메서드, 자식 클래스에서 반드시 구현해야 함
}

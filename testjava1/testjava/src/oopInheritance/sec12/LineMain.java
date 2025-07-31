package oopInheritance.sec12;

public class LineMain {
    public static void main(String[] args) {

        new Line().draw(); // Line 클래스의 인스턴스를 생성하고 draw 메서드를 호출
        new Circle().draw();
        new Rect().draw();

//        //Line 클래스의 인스턴스 생성
//        Line line = new Line().draw();
//        line.draw();
//
//        Circle circle = new Circle();
//        circle.draw();
//
//        Rect rect = new Rect();
//        rect.draw();
//
//        //추상클래스는 인스턴스를 생성할 수 없지만, 추상클래스를 상속받은 클래스는 인스턴스를 생성할 수 있다.
//        //DrawingObject dot = new DrawingObject(); // 컴파일 에러 발생

    }
}

package oopInheritance.sec12;

public class Circle extends DrawingObject {
    public Circle(){
        penColor = "blue";
    }

    @Override
    public void draw() {
        System.out.println("원을 그립니다.");
        System.out.println("펜 색상: " + penColor);
    }
}


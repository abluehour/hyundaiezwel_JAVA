package oopInheritance.sec12;

import java.awt.*;

public class Rect extends DrawingObject {
    public Rect (){
        penColor = "green";
    }

    @Override
    public void draw() {
        System.out.println("사각형을 그립니다.");
        System.out.println("펜 색상: " + penColor);
    }
}

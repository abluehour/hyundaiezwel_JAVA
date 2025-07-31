package oopInheritance.sec12;

public class Line extends DrawingObject {

    public Line(){
        penColor = "red"; //DrawingObject의 필드 pencolor가 public이므로 바로 접근 가능
    }

    @Override
    public void draw() {
        System.out.println("Line을 그립니다.");
        System.out.println("펜 색상: " + penColor);
    }


}

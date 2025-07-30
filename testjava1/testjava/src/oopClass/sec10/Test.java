package oopClass.sec10;

public class Test {
    //인스턴스 멤버 vs static 멤버
    //인스턴스 멤버 : 객체를 통해서만 접근 간으한 멤버(변수/메서드), 객체가 생성될 때 객체별로 하나씩 생성
    // 다른 객체들과 공유 하지 않음 , 객체가 사라지면 함께 사라짐
    int width; // 인스턴스 변수
    int height; // 인스턴스 변수

    //static : 클래스에 고정된 필드와 메서드 즉 클래스 고정 멤버
    //static 멤버 : 클래스를 통해서도 접근 가능 (객체 생성 없이 클래스로 바로 접근해 사용)
    // 특정 클래스를 통해서 생성된 모든 캨체들이 공유해서 사용
    // 프로그램 시작될 때 이미 생성 됨

    static int width1, height1;

    public void area() {
        // 인스턴스 멤버는 객체 생성 후 접근 가능
        System.out.println("인스턴스 멤버의 면적: " + (width * height));
    }

    public static void area1() {
        // static 멤버는 클래스 이름으로 접근 가능
        System.out.println("static 멤버의 면적: " + (width1 * height1));
    }
}

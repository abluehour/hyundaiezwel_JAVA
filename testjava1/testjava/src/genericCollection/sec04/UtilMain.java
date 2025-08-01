package genericCollection.sec04;

public class UtilMain {
    public static void main(String[] args) {
        // Util 클래스의 static 메서드 호출
        // Util 클래스 Boxing 메서드 제네릭, static Box 타입 반환
        // 메서드 호출 시 타입을 구체화
        Box<Integer> box1 = Util.<Integer>boxing(100); //반환값 Box 객체
        int intValue = box1.get(); // Box 객체의 get 메서드 호출하여 Integer 타입 반환

        Box<String> box2 = Util.<String>boxing("문채형"); //타입파라미터가 T고 매개변수는 T 타입을 전달해야함
        String strValue = box2.get(); // Box 객체의 get 메서드 호출하여 String 타입 반환

        // 출력
        System.out.println("Box1의 값: " + intValue); // Box1의 값: 100
        System.out.println("Box2의 값: " + strValue); // Box2의 값: 문채형

    }
}

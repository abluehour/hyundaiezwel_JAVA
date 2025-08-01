package genericCollection.sec02;

public class BoxMain {
    public static void main(String[] args) {
        //네네릭 클래스 활용 : 객체 생성 시 구체적 타입 지정
        Box<String> box = new Box<>(); // Box 클래스의 인스턴스 생성, 타입 파라미터 T는 String으로 지정
        box.set("hello"); // set 메서드에 String 타입의 인수 전달
        String str = box.get(); // get 메서드의 반환 타입이 String이므로 자동 타입 변환

        //정수형 박스 생성
        Box<Integer> box1 = new Box<>(); // Box 클래스의 인스턴스 생성, 타입 파라미터 T는 Integer로 지정
        box1.set(100); // set 메서드에 Integer 타입의 인수 전달
        Integer number = box1.get(); // get 메서드의 반환 타입이 Integer이므로 자동 타입 변환

        //출력
        System.out.println(str); // "hello" 출력
        System.out.println(number); // 100 출력

    }
}

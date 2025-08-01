package genericCollection.sec01;

public class BoxMain {
    public static void main(String[] args) {
        // Box 클래스 활용 : Object 타입 활용 사용할 때 형변환 발생(강제타입 변환 발생) -> 성능이 저하될 가능성 농후
        Box box = new Box(); // Box 클래스의 인스턴스 생성
        box.set("문채형"); // set method의 매개변수 타입 Object 인수는 String : 자동 타입 변환 String- > object
        //box클래스의 object 필드는 object 타입이고 문자열이 저장되어 있는 상태
        String name = (String)box.get(); // get method의 반환 타입 Object를 String으로 자동 타입 변환
        System.out.println(name);

        Box box1 = new Box();
        box1.set(100); // set method의 매개변수 타입 Object 인수는 Integer : 자동 타입 변환 Integer -> object
        //box1클래스의 object 필드는 object 타입이고 정수가 저장되어 있는 상태
        Integer number = (Integer)box1.get(); // get method의 반환 타입 Object를 Integer로 자동 타입 변환
        System.out.println(number);
    }
}

package genericCollection.sec04;

public class Util {
    //멤버 메소드 추가 : 제네릭 타입 메소드 : 접근제한자
    //<T> : 타입파라미터(메소드가 제네릭이라는걸 명시함)
    //Box<T> : 반환 타입
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>(); // Box 클래스의 인스턴스 생성
        box.set(t); // set 메소드 호출 : 매개변수 t를 Box 클래스의 object 필드에 저장
        return box;
    }
}

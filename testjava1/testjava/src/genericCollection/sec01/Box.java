package genericCollection.sec01;

public class Box {
    //필드 1개와 getter, setter가 필요한 클래스
    //어떤 타입의 필드인지 결정하지 않고 모든 타입의 필드를 사용할 수 있도록 클래스를 구성
    //모든 타입을 포함하는 클래스가 object
    private Object object; // Object 타입의 필드

    public void set(Object obj) {
        this.object = obj; // Object 타입의 필드에 값을 설정
    }

    public Object get() {
        return this.object; // Object 타입의 필드 값을 반환
    }
}

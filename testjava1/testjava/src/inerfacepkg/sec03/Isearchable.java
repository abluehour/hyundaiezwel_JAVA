package inerfacepkg.sec03;

public interface Isearchable {
    // 인터페이스: 추상 메서드만 포함하는 클래스
    // 인터페이스는 다중 상속이 가능하다.
    // 인터페이스는 public abstract가 생략되어 있다.

    void search(String url); // 추상 메서드, 구현부가 없음

    // 인터페이스는 상수 필드를 가질 수 있다.
    String SEARCH_URL = "https://www.google.com/search?q="; // 상수 필드, public static final이 생략됨


}

package genericCollection.sec05;

public class CompareMain {
    public static void main(String[] args) {
        //제네릭 클래스 및 제네릭 메소드 사용 예제
        // 객체 생성
        Pair<Integer, String> p1 = new Pair<Integer, String>(1,"사과");
        Pair<Integer, String> p2 = new Pair<>(1,"사과");

        boolean result = Util.compare(p1, p2); // Util 클래스의 compare 메서드 호출

        if(result) {
            System.out.println("두 객체는 동일합니다.");
        } else {
            System.out.println("두 객체는 동일하지 않습니다.");
        }

        //파라미터 타입이 서로 다른 기호여도 같은 타입이어도 상관없음
        Pair<String, String> p3 = new Pair<String, String>("1","사과");
        Pair<String, String> p4 = new Pair<>("2","사과");

        boolean result2 = Util.compare(p3, p4); // Util 클래스의 compare 메서드 호출, 타입 파라미터 명시
        if(result2) {
            System.out.println("두 객체는 동일합니다.");
        } else {
            System.out.println("두 객체는 동일하지 않습니다.");
        }
    }
}


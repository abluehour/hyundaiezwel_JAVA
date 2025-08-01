package genericCollection.sec06;
import  java.util.List;
import java.util.ArrayList;

public class ListGenMain {
    public static void main(String[] args) {
        // 제네릭 타입으로 ArrayList 사용 -> list 인터페이스 활용
        // ArrayList : String 객체만 저장 가능
        List<String> list = new ArrayList<>(); // List 인터페이스를 구현한 ArrayList 클래스의 인스턴스 생성

        list.add("java");
        list.add("python");
        list.add("c++");
        list.add(null);
        // list.add(100); // 컴파일 에러 발생 : Integer 타입은 String 타입이 아님
        System.out.println("총 객체수:" +list.size());
        //출력
        for (String str : list) {
            System.out.println(str); // "java", "python", "c++", null 출력
        }

        System.out.println();
        list.remove(1);
        for (String str : list) {
            System.out.println(str); // "java", "c++", null 출력
        }

        list.add("Multimedia"); // "Multimedia" 문자열 추가)
        for(int i = 0; i < list.size(); i++) {
            String str = list.get(i); // get 메서드를 사용하여 인덱스 i에 해당하는 문자열을 가져옴
            System.out.println(str); // 각 문자열 출력
        }

        for(String str : list ) {
            if (str != null) {
                System.out.println(str.length()); // 각 문자열의 길이를 출력
            } else {
                System.out.println("null");
            }
        }

    }
}

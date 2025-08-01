package genericCollection.sec06;

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        // ArrayList 콜렉션 : 제네릭 타입이 아닌 경우
        ArrayList list = new ArrayList();

        //리스트 항목 추가 : add() 메서드
        list.add(100);
        list.add("문채형");
        list.add(3.14);
        list.add(true);
        list.add('A');

        //리스트 항목 출력 : get() 메서드
        for (int i = 0; i < list.size(); i++) {
            Object item = list.get(i); // get() 메서드로 항목을 가져옴, 반환 타입은 Object
            System.out.println("리스트 항목 " + i + ": " + item);
        }

        System.out.println();

        //리스트 항목 추가2: add(index, element) -> ArrayList에 특정 인덱스에 항목 추가
        list.add(0, "추가된 항목"); // 인덱스 2에 "추가된 항목" 추가
        //리스트 항목 출력2: get() 메서드
        for (int i = 0; i < list.size(); i++) {
            Object item = list.get(i); // get() 메서드로 항목을 가져옴, 반환 타입은 Object
            System.out.println("리스트 항목 " + i + ": " + item);
        }

        System.out.println();

        //리스트 항목 삭제: remove(index) -> ArrayList에서 특정 인덱스의 항목 삭제
        list.remove(2); // 인덱스 2의 항목 삭제
        //리스트 항목 출력3: get() 메서드
        for (int i = 0; i < list.size(); i++) {
            Object item = list.get(i); // get() 메서드로 항목을 가져옴, 반환 타입은 Object
            System.out.println("리스트 항목 " + i + ": " + item);
        }

        System.out.println();

        //리스트에 특정 항목이 포함되어 있는지의 여부 반환 : contains(e) 포함여부 T/F 반환
        System.out.println(list.contains("문채형")); // true

        if (!(list.contains("정웅교"))) {
            list.add("정웅교"); // "정웅교"가 리스트에 없으면 추가
        }

        //리스트 항목 출력4: get() 메서드
        for (int i = 0; i < list.size(); i++) {
            Object item = list.get(i); // get() 메서드로 항목을 가져옴, 반환 타입은 Object
            System.out.println("리스트 항목 " + i + ": " + item);
        }
    }
}

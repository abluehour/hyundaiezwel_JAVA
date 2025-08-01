package genericCollection.sec08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        //성능비교
        //List = ArrayList
        //List = LinkedList
        //ArrayList = ArrayList
        //LinkedList = LinkedList

        List<String> listArrayList = new ArrayList<>(); // ArrayList 생성
        List<String> listLinkedList = new LinkedList<>(); // LinkedList 생성

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        /// ////////////////////////////////////////////////////
        long startTime = System.nanoTime();

        //작업
        for (int i = 0; i < 100000; i++) {
            listArrayList.add(0, String.valueOf(i)); // ArrayList에 요소 추가
        }

        long endTime = System.nanoTime();
        System.out.println("listArrayList 소요 시간: " + (endTime - startTime) + "ns");
        /// ////////////////////////////////////////////////////////
        startTime = System.nanoTime();
        //작업
        for (int i = 0; i < 100000; i++) {
            listLinkedList.add(0, String.valueOf(i)); // LinkedList에 요소 추가
        }
        endTime = System.nanoTime();
        System.out.println("listLinkedList 소요 시간: " + (endTime - startTime) + "ns");
        /// ////////////////////////////////////////////////////////
        startTime = System.nanoTime();
        //작업
        for (int i = 0; i < 100000; i++) {
            arrayList.add(0, String.valueOf(i)); // ArrayList에 요소 추가
        }
        endTime = System.nanoTime();
        System.out.println("arrayList 소요 시간: " + (endTime - startTime) + "ns");
        /// ////////////////////////////////////////////////////////
        startTime = System.nanoTime();
        //작업
        for (int i = 0; i < 100000; i++) {
            linkedList.add(0, String.valueOf(i)); // LinkedList에 요소 추가
        }
        endTime = System.nanoTime();
        System.out.println("linkedList 소요 시간: " + (endTime - startTime) + "ns");
        /// ////////////////////////////////////////////////////////
        //결과
        //ArrayList는 요소를 추가할 때 내부적으로 배열을 사용하여 요소를 저장합니다.
        //배열의 크기가 가득 차면 새로운 배열을 생성하고 기존 요소를 복사하는 작업이 필요합니다.
        //이 과정에서 성능 저하가 발생할 수 있습니다.
        //LinkedList는 요소를 노드로 연결하여 저장합니다.
        //새로운 요소를 추가할 때 노드를 생성하고 연결하는 작업이 필요합니다.
        //따라서, ArrayList는 요소를 추가할 때 성능이 저하될 수 있지만,
        //LinkedList는 요소를 추가할 때 성능이 상대적으로 더 좋습니다.
    }
}

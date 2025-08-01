package genericCollection.sec05;

public class Util {
    //두개의 Pair 객체가 동일 객체인지 확인하는 메소드 : 제네릭 타입 메소드
    public static <k,v> boolean compare(Pair<k,v> p1, Pair<k,v> p2) { //매개변수 Pair 객체 2개가 전달됨
        boolean keyCompare = p1.getKey().equals(p2.getKey()); //두 Pair 객체의 key 필드에 저장된 값이 같은지 비교
        boolean valueCompare = p1.getValue().equals(p2.getValue());

        return keyCompare && valueCompare;
    }
}

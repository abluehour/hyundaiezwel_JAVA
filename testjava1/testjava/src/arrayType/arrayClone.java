package arrayType;

public class arrayClone {
    public static void main(String[] args) {
        // object.clone() 메소드를 사용한 깊은 복사
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = a.clone();

        for(int i = 0; i < a.length; i++) {;
            System.out.printf("a[%d] = %d, b[%d] = %d%n", i, a[i], i, b[i]);
        }

        // a와 b는 이제 서로 다른 배열을 참조
        // a 배열의 값을 변경해도 b 배열은 영향을 받지 않음
        a[0] = 10; // a의 첫 번째 원소를 변경
        System.out.println("After modifying a[0]:");
        for(int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = %d, b[%d] = %d%n", i, a[i], i, b[i]);
        }



    }
}

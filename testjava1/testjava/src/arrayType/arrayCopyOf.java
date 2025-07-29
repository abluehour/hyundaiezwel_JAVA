package arrayType;

import java.util.Arrays;

public class arrayCopyOf {
    public static void main(String[] args) {
        // Arrays.copyOf(원본배열, 복사되는 배열의 크기);
        int[] a = {1,2,3,4};
        int[] b = Arrays.copyOf(a, a.length);
        //int[] b = Arrays.copyOf(a, 7); //원본 길이보다 크게 복사하면 0으로 채움
        //int[] b = Arrays.copyOf(a, 2); //원본 idx 0부터 2개의 원소만 복사

        for(int i = 0 ; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        for(int i = 0 ; i<b.length; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println();
        // a와 b는 이제 서로 다른 배열을 참조
        // a 배열의 값을 변경해도 b 배열은 영향을 받지 않음
        a[0] = 10; // a의 첫 번째 원소를 변경
        System.out.println("After modifying a[0]:");
        for(int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = %d, b[%d] = %d%n", i, a[i], i, b[i]);
        }

    }
}

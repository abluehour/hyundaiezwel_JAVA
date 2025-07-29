package arrayType;

public class arrayStystemCopy {
    public static void main(String[] args) {
        // System.arraycopy(원본배열, 원본시작인덱스, 복사할배열, 복사할시작인덱스, 복사할길이)
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[5]; // a와 동일한 크기의 새로운 배열 생성
        System.arraycopy(a, 0, b, 0, a.length); // a 배열의 모든 원소를 b 배열로 복사
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = %d, b[%d] = %d%n", i, a[i], i, b[i]);
        }
        // a와 b는 이제 서로 다른 배열을 참조
        // a 배열의 값을 변경해도 b 배열은 영향을 받지 않음
        a[0] = 10; // a의 첫 번째 원소를 변경
        System.out.println("After modifying a[0]:");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = %d, b[%d] = %d%n", i, a[i], i, b[i]);
        }
        // System.arraycopy를 사용하여 부분 복사
        int[] c = new int[3]; // 새로운 배열 생성
        System.arraycopy(a, 1, c, 0, 3); // a 배열의 인덱스 1부터 3개의 원소를 c 배열로 복사
        System.out.println("Partial copy from a to c:");
        for (int i = 0; i < c.length; i++) {
            System.out.printf("c[%d] = %d%n", i, c[i]);
        }
        // c 배열의 값을 변경해도 a 배열은 영향을 받지 않음
        c[0] = 20; // c의 첫 번째 원소를 변경
        System.out.println("After modifying c[0]:");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = %d, c[%d] = %d%n", i, a[i], i, c[i]);
        }

    }
}

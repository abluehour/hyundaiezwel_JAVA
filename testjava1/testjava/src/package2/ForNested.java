package package2;

public class ForNested {
    public static void main(String[] args) {
        // 이중 for문을 사용하여 구구단 출력
        for (int i = 2; i <= 9; i++) { // 단수
            for (int j = 1; j <= 9; j++) { // 곱해지는 수
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println(); // 각 단 사이에 빈 줄 추가
        }
    }
}

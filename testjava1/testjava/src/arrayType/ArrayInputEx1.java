package arrayType;

import java.util.Scanner;

public class ArrayInputEx1 {
    public static void main(String[] args) {
        int [] num = new int[5]; // 배열 선언 및 크기 지정
        Scanner sc = new Scanner(System.in);

        System.out.println("5개의 숫자를 입력하세요:");
        for(int i = 0; i < num.length; i++) {
            System.out.printf("num[%d] : ", i);
            num[i] = sc.nextInt(); // 사용자로부터 숫자 입력 받기
        }
        sc.close(); // Scanner 객체 닫기
        System.out.println("---입력된 숫자 출력---");
        for(int i = 0; i < num.length; i++) {
            System.out.printf("num[%d] : %s%n", i, num[i]); // 입력된 숫자 출력
        }
        System.out.println("최댓값 : " + findMax(num)); // 최댓값 출력
    }

    private static int findMax(int[] num) {
        int max = num[0]; // 첫 번째 요소를 최댓값으로 초기화
        for(int i = 1; i < num.length; i++) {
            if(num[i] > max) { // 올바른 최댓값 비교
                max = num[i]; // 더 큰 값이 있으면 최댓값 갱신
            }
        }
        return max; // 최댓값 반환
    }
}

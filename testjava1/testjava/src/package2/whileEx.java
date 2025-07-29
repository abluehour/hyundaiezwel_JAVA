package package2;

import java.util.Scanner;

public class whileEx {
    public static void main(String[] args) {
        // while문을 사용하여 1부터 100까지의 합을 구하는 예제
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("숫자 입력: ");
        sum = sc.nextInt(); //초기값

        while (sum != 7) { // 조건식
            System.out.print("다시입력: "); // sum에 i 값을 누적
            sum = sc.nextInt();
        }

        System.out.println("7이 입력되었습니다. 프로그램을 종료합니다.");
        sc.close();
    }
}

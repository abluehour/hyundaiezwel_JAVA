package package2;

import java.util.Scanner;
public class doWhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        String answer;

        System.out.println("과정 안내 프로그램");

        do {
            System.out.println("\n 1~4 번호 입력: ");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("JAVA 프로그래밍");
                    break;

                case 2:
                    System.out.println("C 프로그래밍");
                    break;
                case 3:
                    System.out.println("파이썬 프로그래밍");
                    break;
                case 4:
                    System.out.println("자바스크립트 프로그래밍");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 1~4 사이의 숫자를 입력하세요.");
            }
            System.out.println("계속하시겠습니까? (y/n): ");
            answer = sc.next(); // 사용자 입력 받기
        } while (answer.equalsIgnoreCase("y")); // 대소문자 구분 없이 'y' 입력 시 반복
        System.out.println("프로그램을 종료합니다.");
        sc.close(); // Scanner 객체 닫기
    }
}

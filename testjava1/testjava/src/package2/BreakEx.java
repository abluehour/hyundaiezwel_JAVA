package package2;

import java.util.Scanner;

public class BreakEx {
    public static void main(String[] args) {
        //현재 잔액 100000
        int balance = 100000;
        //인출액 입력
        Scanner sc = new Scanner(System.in);

        while (balance > 0) {
            System.out.print("인출액 입력(잔액: " + balance + "): ");
            int amount = sc.nextInt(); //인출액 입력

            if (amount <= 0) {
                System.out.println("인출액은 0보다 커야 합니다.");
                continue; // 잘못된 입력은 다시 입력 받기
            }

            if (amount > balance) {
                System.out.println("잔액이 부족합니다. 현재 잔액: " + balance);
                continue; // 잔액 부족 시 다시 입력 받기
            }

            balance -= amount; // 잔액에서 인출액 차감
            System.out.println("인출 완료. 남은 잔액: " + balance);

            if (balance < amount) {
                System.out.println("잔액부족, 현재잔액: " + balance);
                break; // 잔액이 0이면 반복문 종료
            }

        } sc.close();
    }
}

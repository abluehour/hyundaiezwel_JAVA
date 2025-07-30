package oopClass.myDummy;

import java.util.Scanner;

public class Tank {
    //필드
    private String name; // 탱크의 이름
    private boolean attackMode; // 탱크의 공격 모드 여부
    private int speed; // 탱크의 속도
    private int attackPower; // 탱크의 공격력

    public Tank() {
        this.name = "기본 탱크"; // 기본 이름 설정
        this.attackMode = false; // 기본 공격 모드 비활성화
        this.speed = 0; // 기본 속도 0
        this.attackPower = 10; // 기본 공격력 10
    }

    public Tank(String name, boolean attackMode, int speed, int attackPower) {
        this.name = name; // 탱크 이름 초기화
        this.attackMode = attackMode; // 공격 모드 초기화
        this.speed = speed; // 속도 초기화
        this.attackPower = attackPower; // 공격력 초기화
    }

    public void setTank(String name, boolean attackMode, int speed, int attackPower) {
        this.name = name; // 탱크 이름 초기화
        this.attackMode = attackMode; // 공격 모드 초기화
        this.speed = speed; // 속도 초기화
        this.attackPower = attackPower; // 공격력 초기화
    }

    public void showInfo() {
        System.out.println("탱크 이름: " + name);
        System.out.println("공격 모드: " + (attackMode ? "활성화" : "비활성화"));
        System.out.println("속도: " + speed + " km/h");
        System.out.println("공격력: " + attackPower);
    }

    public void modeChange() {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("공격 모드를 변경하시겠습니까? (1: 활성화, 2: 비활성화): ");
            int choice = sc.nextInt();
            if (choice == 1) {
                attackMode = true; // 공격 모드 활성화
                attackPower += 100; // 공격력 증가
                System.out.println("공격 모드가 활성화되었습니다.");
                System.out.println("공격력이 " + attackPower + "로 증가했습니다.");

            } else if (choice == 2) {
                attackMode = false; // 공격 모드 비활성화
                attackPower -= 100; // 공격력 감소
                System.out.println("공격 모드가 비활성화되었습니다.");
                System.out.println("공격력이 " + attackPower + "로 감소했습니다.");
            } else {
                System.out.println("잘못된 입력입니다. 1 또는 2를 입력해주세요.");
            }
        } catch (Exception e) {
            System.out.println("입력 오류가 발생했습니다. 숫자를 입력해주세요.");
        }
    }


}

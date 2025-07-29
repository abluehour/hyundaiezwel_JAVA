package arrayType;

import java.util.Scanner;

public class arrayType {
    public static void main(String[] args) {
        //배열 생성 후 배열 크기 만큼 명단 입력 받고 입력 받은 명단출력
        Scanner sc = new Scanner(System.in);
        String[] name = new String[5];

        System.out.println("이름을 입력하세요:");
        for(int i=0;i<name.length;i++) {
            System.out.printf("name[%d] :", i);
            name[i] = sc.next(); // 사용자로부터 이름 입력 받기
        }
        System.out.println("---명단출력---");
        for(int i=0;i<name.length;i++) {
            System.out.printf("name[%d] : %s%n", i, name[i]);
        }
    }
}

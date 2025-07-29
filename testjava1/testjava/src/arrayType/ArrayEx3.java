package arrayType;

import java.util.Arrays;

public class ArrayEx3 {
    //1~45 숫자 중 중복되지 않는 6개의 숫자를 랜덤으로 생성하여 출력하는 프로그램 작성
    public static void main(String[] args) {
        int[] lotto = new int[6]; // 로또 번호를 저장할 배열
        boolean[] check = new boolean[46]; // 1~45까지의 숫자 중 중복 체크를 위한 배열

        int count = 0; // 생성된 로또 번호의 개수

        while (count < 6) {
            int num = (int) (Math.random() * 45) + 1; // 1~45 사이의 랜덤 숫자 생성

            if (!check[num]) { // 중복 체크
                lotto[count] = num;
                check[num] = true;
                count++;
            }
        }

        // 생성된 로또 번호 출력
        System.out.print("생성된 로또 번호: ");
        Arrays.sort(lotto);
        for (int i : lotto) {
            System.out.print(i + " ");
        }
    }
}

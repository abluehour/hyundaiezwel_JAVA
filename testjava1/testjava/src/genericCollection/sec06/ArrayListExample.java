package genericCollection.sec06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);


            List<String> word = new ArrayList<>(); // String 타입의 ArrayList 생성 단어4개 입력

            for (int i = 0; i < 4; i++) {
                System.out.print("단어를 입력하세요 :");
                String scWord = sc.nextLine(); // 사용자로부터 단어 입력 받기
                word.add(scWord);
            }
            System.out.println("----------------------");

            for (String i : word) { // 리스트에 저장된 단어 출력
                System.out.print(i + " ");
            }

            //가장 긴 단어
            String longestWord = "";
            for (String i : word) {
                if (i.length() > longestWord.length()) {
                    longestWord = i;
                }
            }

            //가장 긴 단어의 길이
            int longestLength = longestWord.length();

            System.out.println("\n가장 긴 단어: " + longestWord + " (길이: " + longestLength + ")");

            sc.close();

    }
}

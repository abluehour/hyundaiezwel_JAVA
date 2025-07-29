package arrayType;

import java.util.Scanner;

public class array2DEx2 {
    public static void main(String[] args) {
        // 단어-뜻 쌍을 2차원 배열로 관리
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"},
        };
        Scanner sc = new Scanner(System.in);
        // for 반복문으로 배열의 모든 단어에 대해 질문 생성
        for (int i = 0; i < words.length; i++) {
            String question = words[i][0];
            String correctAnswer = words[i][1];

            System.out.printf("Q%d. %s의 뜻은 무엇인가요?%n", i + 1, question);
            System.out.print("답: ");
            String userAnswer = sc.nextLine();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("정답입니다!");
            } else {
                System.out.println("틀렸습니다. 정답은 " + correctAnswer + "입니다.");
            }
            System.out.println(); // 질문 사이에 한 줄 띄우기
        }
        sc.close();
        System.out.println("퀴즈가 종료되었습니다.");
    }
}

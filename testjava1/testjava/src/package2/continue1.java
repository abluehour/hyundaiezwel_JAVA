package package2;

public class continue1 {
    public static void main(String[] args) {
        //짝수만 풀력학호 홀수는 skip
        for(int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { // 홀수인 경우
                continue; // 다음 반복으로 넘어감
            }
            System.out.println(i); // 짝수인 경우에만 출력
        }
    }
}

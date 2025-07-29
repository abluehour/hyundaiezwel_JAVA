package package2;

public class randomNum1 {
    public static void main(String[] args) {
        // 랜덤 숫자 생성 -1. Math.random() 사용
        for(int i=1; i<=10; i++) {
            double num = Math.random(); // 0.0 이상 1.0 미만의 랜덤 숫자 생성
            int num1 = (int)(num * 100); // 0 이상 100 미만의 정수로 변환
            int num2 = (int)(num * 100) + 1; // 1 이상 100 이하의 정수로 변환
            System.out.println("랜덤 숫자 " + i + ": " + num);
            System.out.println("랜덤 정수 " + i + ": " + num1);
            System.out.println("랜덤 정수 +1 " + i + ": " + num2);

        }
    }
}

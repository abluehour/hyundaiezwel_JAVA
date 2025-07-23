package package2;

public class Reep {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            sum += i; // i 값을 sum에 누적

        }
        System.out.println("1부터 100까지의 합: " + sum);
    }
}

package arrayType;

public class advancedFor {
    public static void main(String[] args) {
        // 배열 컬렉션 활용 반복 요소로 진행
        int[] scores = {95,71,84,93,89};

        for(int score : scores) {
            System.out.println(score);
        }

        String[] flowers = {"장미", "무궁화", "연산홍"};

        for(String flower : flowers) {
            System.out.print(flower + " ");
        }

    }
}

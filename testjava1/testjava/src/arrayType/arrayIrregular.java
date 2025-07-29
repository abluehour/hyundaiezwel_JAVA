package arrayType;

public class arrayIrregular {
    public static void main(String[] args) {
        //가변형 배열
        int a[][] = new int[4][];
        a[0] = new int[1]; // 0행은 1개의 열
        a[1] = new int[2]; // 1행은 2개의 열
        a[2] = new int[3]; // 2행은 3개의 열
        a[3] = new int[4]; // 3행은 4개의 열

        char b[][] = {
            {'a'},
            {'b', 'c'},
            {'d', 'e', 'f'}};
    }

    String student [][] = {
        {"홍길동", "남"},
        {"김영희", "여", "대전"}
    };


}

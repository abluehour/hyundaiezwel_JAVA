package oopClass.sec09;

public class Book {
    private String title; // 책 제목
    private String author; // 책 저자
    private int price;

    public Book() {
        this("제목 없음", "저자 없음", 0); // 다른 생성자 호출
    }



    public Book(String t, String au, int p) {
        title = t;
        author = au;
        price = p;
    }

    public void showInfo() {
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("가격: " + price + "원");
    }


}

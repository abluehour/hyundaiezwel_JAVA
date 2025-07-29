package oopClass.sec04;

import java.util.Scanner;

public class Product {
    // 멤버 변수
    private String name; // 제품명
    private int price; // 가격
    //판매수량
    private int soldQuantity;
    //재고 수량
    private int stock; // 재고 수량
    // 판매 수량

    // 생성자
    public void inputProduct() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("제품명: ");
            this.name = sc.nextLine(); // 제품명 입력
            System.out.print("가격: ");
            this.price = sc.nextInt(); // 가격 입력
            System.out.print("판매 수량: ");
            this.soldQuantity = sc.nextInt(); // 판매 수량 입력
            System.out.print("재고 수량: ");
            this.stock = sc.nextInt(); // 재고 수량 입력
        } catch (Exception e) {
            System.out.println("입력 오류: " + e.getMessage());
        }
    }
    // 멤버 메소드: 제품 정보 출력
    public void showProductInfo() {
        System.out.println("제품명: " + name);
        System.out.println("가격: " + price + "원");
        System.out.println("판매 수량: " + soldQuantity + "개");
        System.out.println("재고 수량: " + stock + "개");
        System.out.println("총 매출액: " + (price * soldQuantity) + "원");
        System.out.println("남은 재고액: " + (price * stock) + "원");
    }
    public static void main(String[] args) {
        Product product = new Product();
        System.out.println("**** 제품 정보 입력 ****");
        product.inputProduct(); // 제품 정보 입력
        System.out.println("**** 제품 정보 출력 ****");
        product.showProductInfo(); // 제품 정보 출력
    }
}
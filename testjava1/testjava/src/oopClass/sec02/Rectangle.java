package oopClass.sec02;

import java.util.Scanner;

import java.util.Scanner;
public class Rectangle {
    //멤버변수
    private int width; // 가로
    private int height; // 세로

    // 생성자
    public void input() {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter width: ");
            this.width = sc.nextInt(); // 가로 길이 입력
            System.out.print("Enter height: ");
            this.height = sc.nextInt(); // 세로 길이 입력
        } catch (Exception e) {
            System.out.println("입력 오류: " + e.getMessage());
        };
    }
    public int area() {
        return width * height; // 면적 계산
    }
}

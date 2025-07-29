package oopClass.sec02;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        // 사각형 면적 계산 프로그램
        Rectangle rect = new Rectangle();
        rect.input(); // 가로와 세로 길이를 입력받음

        System.out.println(rect.area());


    }


}

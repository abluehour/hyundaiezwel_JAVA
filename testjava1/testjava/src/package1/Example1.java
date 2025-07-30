package package1;

import com.sun.jdi.Value;

public class Example1 {
    public static void main(String[] args) {
        // 자바 변수 : type을 표현해야 함
        int value1; //변수선언
        int value =10; //변수 선언과 초기화
        value1 = 10; //변수 초기화
        int result = value1 + 10; //변수 연산

        System.out.println(result);

        // 자바 상수 : 실행 중 값 기억 임시 기억장소(변수와 같은) 대입 후 실행 중 값이 변하지 않는다
        // fianl 데이터 타입 변수명
        // 변수와 구분하기 위해서 대문자로 명명
        final int PRICE = 1000; //상수 선언과 초기화
        // PRICE = 2000; //상수는 값 변경 불가

        // 리터럴 : 변수에 저장되는 값
        // 정수, 실수, 문자, 문자열, 논리 리터럴
        value = 50; //50 정수형 리터럴
        float valf = 50.2f; //50.2 실수형 리터럴
        char valchar = 'A'; //A 문자형 리터럴
        String valstr = "Hello"; //Hello 문자열 리터럴
        boolean valbool = true; //true 논리형 리터럴

        //데이터 타입
        //기본 타입 : byte/short/int/long      /float/double    /char   /boolean
        //참조형 : 기본 타입 제외 나머지 모두 String

        int aint = 10; //기본 타입 int
        double adouble = 10.5; //기본 타입 double

        long along = 100L; //8byte 정수형 리터럴은 L을 붙여야 함
        float flt = 10.5f; //4byte 실수형 리터럴은 f를 붙여야 함
        short sint = 10; //2byte 정수형 리터럴
        byte bint = 1; //1byte 정수형 리터럴 , 첫번째 비트 부호 사용 -0 +1

        // 데이터 타입에 따라 사용 메모리 크기가 다름
        // 메모리 최소단위 : bit -> 0/1 => 8개가 모여 1byte
        // bit : 2^1 표현 byte : 2^8 = 256 (0~255) 0000000 => 0, 11111111 => 255
        // byte : -2^7 ~ 2^7-1 -128 ~ +128
        //int : -2,147483,648 ~ +2,147,483,647

        //실수저장 - 저장방식이 정수형과 다르기 때문에 정수 타입보다 훨씬 큰 범위의 값 저장 가능
        // 부동 소수점 방식으로 저장
        // 부로비트 지수부 가수부
        // 4byte 부호비트(1) 지수부(8 비트) 가수부(32비트)
        // 8byte 부호비트(1) 지수부(11 비트) 가수부(32비트)
        //십진수 12.375를 부동소수점 방식으로 표현 1.2375
        float avg = 88.5f; // float은 f,F 뒤에 붙임
        double avg1 = 88.5;
        // e 사용래서 실수 표현
        double var3 = 3e6; //3뒤로 0을 6개 추가 3000000
        float var4 = 2e-3f; //소수점 이하 3자리
        System.out.println(var3);
        System.out.println(var4);

        System.out.println(true);

        // String 타입(문자열) - 레퍼런스 타입
        String name = "홍길동";
        char firstName = '홍';
        System.out.println(name);
        System.out.println(firstName);



    }
}

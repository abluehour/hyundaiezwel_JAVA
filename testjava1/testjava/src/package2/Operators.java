package package2;

public class Operators {
    public static void main(String[] args) {
        short a = 100;
        short b = -100;

        // short result = -a; // short type 변수 a에 부호연산자 -를 적용하면 반환 타입은 int -> short에 저장 불가

        // 증감연산자 ++ -- : 변수의 값 1증가 또는 감소

        // 연산식에 증감연산만 있는 경우 - 연산자 위치 상관없이 1씩 증가
        int x = 10;
        x++; //x가 11로 변경
        System.out.println(x);
        ++x; //x가 12로 변경
        System.out.println(x);

        //연산식에 증감연산과 다른 연산(대입연산)이 같이 있는 경우
        int x1 = 10;
        int y1 = 0;

        y1 = x1++; //++가 대입연산 이후로 밀림 x1의 값을 먼저 y1에 대입(10이 대입)시키고 x1을 1 증가 11이 됨
        System.out.println(y1);
        y1 = ++x1; //11인 x1을 먼저 증가시키고(12가 됨) y1에 대입 -> y1은 12가 대입
        System.out.println(y1);

        x=1;
        int y=1;

        System.out.println(++x ); //x를 증가시켜서 출력 : 2
        System.out.println(y++ ); // 출력 후 y를 증가 : 1

        x=1;
        y=1;
        System.out.println(++x+10 ); //x를 증가시켜서 2가 되고, 10을 더해 12가 출력
        System.out.println(y+++10 ); //y의 값 1을 먼저 10과 더해 11을 출력 후 y를 1 증가시킴

        // 이항 연산자 : + - * / %
        // 주의 : 연산 결과 오버플로우 발생 가능 : 연산 결과값이 너무 커서 제대로 저장이 일어나지 않는 경우
        int x2 = 1000000; //백만
        int y2 = 1000000; //백만

        int z2 = x2 * y2; //x2 * y2의 결과가 int형 반환 (오버플로우 발생)
        System.out.println(z2); //-727379968 오버플로우 발생

        long x3 = 1000000; //백만
        int y3 = 1000000; //백만

        long z3 = x3 * y3; // (long * int) 연산 결과는 long
        System.out.println(z3); // 1000000000000
        //피연산자 단위가 크면 결과 저장할 변수의 타입을 크게 잡는다 long타입 사용

        // 연산
        // 정수 0 또는 실수 0.0으로 나누는 경우 - 예외발생하거나 Infinity 출력
        //System.out.println(10/0); //예외 발생 - 아래코드 실행하지 않고 프로그램 종료
        System.out.println(10/0.0); //Infinity

        // %연산
        // 정수 0 또는 실수 0.0으로 나누는 경우 - 예외발생하거나 NaN 출력
        //System.out.println(10%0); // / by zero , 프로그램은 종료됨
        System.out.println(10%0.0); // NaN (Not a Number)
        // + 문자열 연결 연산
        String city = "서울시";
        String gu = " 강남구";
        System.out.println(city+gu);

        // 비교 연산자 : == != -> boolean type 반환
        System.out.println(x2 == y2);
        System.out.println(x2 != y2);

        // 문자열 비교
        System.out.println(city == gu);
        System.out.println(city != gu);
        String name1 = "홍길동";
        String name2 = "홍길동";
        //name1과 name2에 동일한 값이 저장되어 있는지 비교 연산

        // 참조 주소 비교
        System.out.println(name1 == name2);
        System.out.println(name1 != name2);

        //문자열 객체 메소드 equals를 활용 값을 비교하는 기능
        System.out.println(name1.equals(name2));

        // 왼쪽으로 이동하면 오른쪽 빈칸은 0으로 채움
        // 오른쪽으로 이동하면 왼쪽 빈칸은 부호비트와 같은 값으로 채워짐
        int result = 1 << 3;
        System.out.println(result);

        result = 8 >> 3;
        System.out.println(result);

        // 대입 연산자
        int xVal = 100;
        // 누적대입 연산자 -> &=, |=, ^=, <<=, >>=
        xVal += 100; // xVal = xVal + 100

        // 삼항 연산자 : 조건식 ? 값 또는 연산식 : 값 또는 연산식 => if ~ else 구문을 연산자로
        int score = 95;
        char grade = (score>90) ? 'A' : 'B';

        // ()연산자
        byte score_sub = (byte)score;
    }
    }



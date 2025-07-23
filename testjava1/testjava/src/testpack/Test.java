package testpack;

class A{

}

class B{
    //클래스는 한개의 java파일에 여러개 생성할  수 있지만 main을 포함하는 클래스는 1개만 있어야함
}

public class Test { //main을 담고 있는 클래스가 파일명
    //main이 없는 클래스들만 있으면 public 클래스는 파일에서 한개만 구성하고 public인 클래스를 파일명으로 사용
    //public은 접근 제한이 없음
    public static void main(String[] args) {
        //자바 프로젝트 실행 시작 점
        //객체 생성 하지 않고 main 함수 사용 간으하도록 static으로 구성됨 - 객체 없이 바로 호출 가능
        //main 함수가 종료되면 프로그램 종료
        //main 함수가 종료되면 프로그램 종료 - 프로젝트에서 한번만 표현됨
        //main 함수가 포함된 클래스는 public 이어야함
        //String[] args : mian을 가상머신이 호출할 때 전달되는 data가 args로 전달됨
        //매개변수도 자바 변수기때문에 변수의 type을 Sting[]로 결정했음
        System.out.print("테스트입니다.");

    } //프로그램 종료
}

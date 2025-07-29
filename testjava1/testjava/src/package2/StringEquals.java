package package2;

public class StringEquals {
    public static void main(String[] args) {
        // 문자열 객체 생성 1: String 변수명 = "변수명"
        String steVar1 = "Hello World";
        String steVar2 = "Hello World";

        if(steVar1 == steVar2) {
            System.out.println("steVar1과 steVar2는 같은 객체입니다.");
        } else {
            System.out.println("steVar1과 steVar2는 다른 객체입니다.");
        }
        //strVar1은 String 클래스의 객체참조 변수 -> 클래스 메소드 사용가능
        //quals는 참조객체의 값이 같은지 확인하는 메소드
        if(steVar1.equals(steVar2)) {
            System.out.println("steVar1과 steVar2는 같은 값을 가지고 있습니다.");
        } else {
            System.out.println("steVar1과 steVar2는 다른 값을 가지고 있습니다.");
        }
        // 문자열 객체 생성 2: String 변수명 = new String("문자열")
        String steVar3 = new String("Hello World");
        String steVar4 = new String("Hello World");

        if(steVar3 == steVar4) {
            System.out.println("steVar1과 steVar2는 같은 객체입니다.");
        } else {
            System.out.println("steVar1과 steVar2는 다른 객체입니다.");
        }
        //strVar1은 String 클래스의 객체참조 변수 -> 클래스 메소드 사용가능
        //quals는 참조객체의 값이 같은지 확인하는 메소드
        if(steVar3.equals(steVar4)) {
            System.out.println("steVar1과 steVar2는 같은 값을 가지고 있습니다.");
        } else {
            System.out.println("steVar1과 steVar2는 다른 값을 가지고 있습니다.");
        }
    }
}

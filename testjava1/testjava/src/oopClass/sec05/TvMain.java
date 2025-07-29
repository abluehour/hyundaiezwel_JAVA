package oopClass.sec05;

public class TvMain {
    public static void main(String[] args) {
        Tv[] tvs = new Tv[3]; // Tv 객체 배열 선언
        for(int i=0;i<tvs.length;i++){
            tvs[i] = new Tv(); // Tv 객체 생성
            tvs[i].channel = i + 10; // 채널 설정
        }
    }
}

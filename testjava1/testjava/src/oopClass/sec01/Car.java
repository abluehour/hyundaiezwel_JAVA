package oopClass.sec01;


// 사용자 정의 클래스 생성 : 개발자가 필요한 변수(필드/속성), 함수(메서드) 정의
// 데이터를 다루기 위한 변수 : 멤버 변수
// 데이터를 조작하기 위한, 기능을 수행 하기 위한 함수 : 멤버 메소드
public class Car {

        //멤버 변수, 데이터
        private String carNo; // 차량번호
        private String carName; // 차량이름
        private String carMaker; // 제조사
        private String carYear; // 연식
        private String carCC; // 배기량
        // private: 접근제한자, 클래스 내부에서만 사용 가능

        // 멤버 메소드, 기능
        //(1) 멤버 변수 값을 초기화하는 매소드 - 직접 초기화
        public void setCarInfo( String carNo, String carName, String carMaker, String carYear, String carCC) {
            this.carNo = carNo;
            this.carName = carName;
            this.carMaker = carMaker;
            this.carYear = carYear;
            this.carCC = carCC;
        }

        // (2) 멤버 변수 값을 출력하는 매소드
        public void showCarInfo() {
            System.out.println("차량번호: " + carNo);
            System.out.println("차량이름: " + carName);
            System.out.println("제조사: " + carMaker);
            System.out.println("연식: " + carYear);
            System.out.println("배기량: " + carCC);
        }

}

package oopClass.sec10;

public class ReservationMain {
    public static void main(String[] args) {
        // 예약 시스템 객체 생성
        Reservation res = new Reservation();

        System.out.println("** 항공권 예약 정보**");
        res.showRsvInfo(); // 예약 정보 출력

        Reservation res2 = new Reservation("KE1001", "홍길동", "인천", "뉴욕", 160000, "A38");
        System.out.println("** 항공권 예약 정보**");
        res2.showRsvInfo(); // 예약 정보 출력
    }
}

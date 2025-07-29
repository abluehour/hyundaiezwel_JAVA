package oopClass.sec10;

public class Reservation {
    private String flightNumber; // 항공편 번호
    private String name; // 예약자 이름
    private String departure; // 출발지
    private String destination; // 도착지
    private int price; // 예약 금액
    private String seatNumber; // 좌석 번호

    public Reservation() {
        this("미정", "이름 미정", "출발지 미정", "도착지 미정", 0, "좌석 미정");
    }

    public Reservation(String flightNumber, String name, String departure, String destination, int price, String seatNumber) {
        this.flightNumber = flightNumber;
        this.name = name;
        this.departure = departure;
        this.destination = destination;
        this.price = price;
        this.seatNumber = seatNumber;
    }

    public void showRsvInfo(){
        System.out.println("항공편 번호: " + flightNumber);
        System.out.println("예약자 이름: " + name);
        System.out.println("출발지: " + departure);
        System.out.println("도착지: " + destination);
        System.out.println("예약 금액: " + price + "원");
        System.out.println("좌석 번호: " + seatNumber);
    }

}

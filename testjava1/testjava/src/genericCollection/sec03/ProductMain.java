package genericCollection.sec03;

public class ProductMain {
    public static void main(String[] args) {
        // 멀티 타입 파라미터 제네릭 클래스 사용
        Product<Tv, String> tvProduct = new Product<>();
        Product<Car, String> carProduct = new Product<>();

        tvProduct.setKind(new Tv());
        tvProduct.setModel("Samsung QLED 55");
        carProduct.setKind(new Car());
        carProduct.setModel("Tesla Model S");

        // Tv 객체의 정보 출력
        Tv tv = tvProduct.getKind();
        String tvModel = tvProduct.getModel();
        System.out.println("TV Model: " + tvModel);

        // Car 객체의 정보 출력
        Car car = carProduct.getKind();
        String carModel = carProduct.getModel();
        System.out.println("Car Model: " + carModel);

    }
}

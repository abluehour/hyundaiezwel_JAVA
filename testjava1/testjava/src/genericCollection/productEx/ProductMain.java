package genericCollection.productEx;

import java.util.LinkedList;

public class ProductMain {
    public static void main(String[] args) {
        Product item1 = new Product("T-Shirt", 42, "Red");
        Product item2 = new Product("Jeans", 32, "Blue");
        Product item3 = new Product("Sneakers", 10, "White");

        // 3개의 상품을 LinkedList에 저장하고 출력
        LinkedList<Product> productList = new LinkedList<>();

        productList.add(item1);
        productList.add(item2);
        productList.add(item3);

        System.out.println("LinkedList of Products:");
        for (Product item : productList) {
            System.out.println(item);
        }

    }
}

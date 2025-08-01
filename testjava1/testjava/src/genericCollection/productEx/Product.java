package genericCollection.productEx;

import java.util.LinkedList;

public class Product {

    private String name;
    private int size;
    private String color;

    public Product(String name, int size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}

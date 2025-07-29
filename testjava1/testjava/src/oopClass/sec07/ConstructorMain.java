package oopClass.sec07;

public class ConstructorMain {
    public static void main(String[] args) {
        //생성자 호출
        Constructor c1 = new Constructor(10);

        c1.Show(); //x: 100, y: 0

        Constructor c2 = new Constructor();

        c2.Show();


    }
}

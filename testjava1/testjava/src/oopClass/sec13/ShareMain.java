package oopClass.sec13;

public class ShareMain {
    public static void main(String[] args) {
        Share s1, s2;

        s1 = new Share();
        s1.set(5);

        System.out.println("s1의 a : " + s1.showA());
        System.out.println("staicA : " + s1.showStaticA());

        s2 = new Share();
        s2.set(5);

        System.out.println("s2의 a : " + s2.showA());
        System.out.println("staicA : " + s2.showStaticA());
        System.out.println("staicA : " + Share.showStaticA());
    }
}

package oopInheritance.sec08;

public class MyCar {
    public int speed;

    public void speedUp(int speed){
        this.speed+=speed;
    }

    public void speedDown(int speed){
        this.speed-=speed;
    }
    public void stop(){
        System.out.println("차를 멈춤!");
        speed=0;
    }
}

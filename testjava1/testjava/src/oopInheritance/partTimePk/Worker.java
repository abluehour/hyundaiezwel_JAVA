package oopInheritance.partTimePk;

public class Worker {
    private String name;
    private String joominNo;

    public Worker(String name, String joominNo) {
        this.name = name;
        this.joominNo = joominNo;
    }

    @Override
    public String toString() {
        return "이름: " + name + "\n주민등록번호: " + joominNo;
    }
}

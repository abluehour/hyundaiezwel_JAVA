package oopInheritance.sec11;

public class CatMain {
    public static void main(String[] args) {
        //강제 타입 변환
        Animal ap = null;

        ap = new Dog(); //자동 타입 변환
        ap.show(); //Dog 클래스에서 재정의 해 놓은 메서드가 호출된 상태
        ap.sound();

        ap.animalMethod(); //Animal 클래스의 메서드 호출 - Dog 클래스에서 재정의하지 않았으므로 Animal 클래스의 메서드가 호출됨
        //ap.dogMethod(); //Dog 클래스의 dogMethod() 메서드는 Animal 클래스에 정의되어 있지 않으므로 호출 불가

        //Dog 클래스의 dogMethod() 메서드를 호출하려면 강제 타입 변환이 필요
        //ap의 타입은 Animal임, 참조 객체는 Dog 타입의 객체를 참조 중
        //아래와 같이 대입하면 타입 불일치 에러 발생 -> 단, ap Dog 객체를 참조 중 이고 Dog -> Animal 관계이므로 강제 타입 변환 가능
        //Dog d = ap; //에러 발생
        //강제 타입 변환
        Dog d = (Dog) ap; //ap가 Dog 객체를 참조 중이므로 강제 타입 변환 가능
        d.dogMethod(); //Dog 클래스의 dogMethod() 메서드 호출 가능

        //instanceof : 객체의 타입을 확인하는 연산자
        //객체 instanceof type -> 참조타입이면 true, 아니면 false 반환
        //부모타입 객체가 모두 자식타입ㄴ으로 강제 형변환이 가능한 건 아님 -> 자식타입에 근거 한 객체여야 함
        Animal aa = new Animal(); //Animal 클래스의 인스턴스 생성
        //Dog dd =(Dog) aa; //에러 발생 - Animal 클래스의 인스턴스를 DodogMethodg 타입으로 강제 형변환 할 수 없음

        if (aa instanceof Dog) { //ap가 Dog 타입의 객체를 참조 중인지 확인
            Dog dd = (Dog) aa; //ap가 Dog 타입의 객체를 참조 중이므로 강제 형변환 가능
        } else {
            System.out.println("aa는 Dog 타입의 객체를 참조하지 않습니다.");
        }

    }
}

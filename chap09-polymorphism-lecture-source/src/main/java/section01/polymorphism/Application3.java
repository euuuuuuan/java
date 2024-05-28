package section01.polymorphism;

public class Application3 {

    // 다형성을 적용해, 매개변수에 활용할 수 있다.
    public static void main(String[] args) {

        Application3 app3 = new Application3();
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        // 동일한 타입
        app3.feed(animal1);
        app3.feed(animal2); // 다운캐스팅

        Rabbit animal3 = new Rabbit();
        Tiger animal4 = new Tiger();

        app3.feed((Animal) animal3);
        app3.feed((Animal) animal4); // 업캐스팅
        // 인스턴스를 생성하여 바로 묵시적으로 형변환을 이용해 전달가능

    }

    public void feed(Animal animal) {
        animal.eat();
    }
}

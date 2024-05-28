package section01.polymorphism;

public class Application4 {

    // 다형성을 적용하여 리턴타입에 활용할 수 있다.
    public static void main(String[] args) {

        Application4 app4 = new Application4();
        Animal randomAnimal = app4.getRandomAnimal();
        randomAnimal.cry();
    }

    public Animal getRandomAnimal(){

        int random = (int) (Math.random() * 2); // 0, 1
        // Math.random()함수는 double 형으로 0.0이상 1.0 미만 사이의 값을 반환하는 함수이다.

        return random == 0 ? new Rabbit() : new Tiger();
    }
}

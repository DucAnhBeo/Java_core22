package demo06;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
        cat.eat();

        Animal animal = new Animal();
        animal.eat();

        Bird bird = new Bird();
        bird.eat();
    }

}

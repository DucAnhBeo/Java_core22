package demoInterface02;

public class Chicken extends Bird implements Flyable, Digestible{

    @Override
    public void fly() {
        System.out.println("Ga bay");
    }

    @Override
    public void eat() {

    }
}

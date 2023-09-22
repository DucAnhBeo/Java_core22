package demoInterface02;

public class Chicken extends Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("Ga bay");
    }
}

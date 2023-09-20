package demoInterface;

//override tat ca cac abstract method

public class Student implements Person, Animal {
    @Override
    public void demo() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void run() {
        Person.super.run();
    }

    @Override
    public void demoAnimal(){

    }

}

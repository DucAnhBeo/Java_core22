package demoInterface;

public interface Person {


    public static final float PI = 3.14f;
    float ABC = 3.14f;

    public abstract void demo();

     void eat(); // public abstract void demo();

    // ko chứa phương thức thường nhưng chứa phương thức default
    public default void run() {
        System.out.println("Running..");
    }
}

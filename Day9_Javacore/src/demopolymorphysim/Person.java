package demopolymorphysim;

import java.util.PrimitiveIterator;

public class Person {

    private String id;
    private String name;

    public void study(){
        System.out.println("Con nguoi dang hoc....");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

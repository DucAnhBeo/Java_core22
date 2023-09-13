public class ConTro {
    public static void main(String[] args) {



        Student sv1 = new Student();
        sv1.fullName = "A";

        Student sv3 = sv1;
        sv3.fullName = "C";

        System.out.println(sv1);
        System.out.println(sv3);

        Student sv2= new Student();
        sv2.fullName="B";

        System.out.println(sv2);
        changeName1(sv2);
        System.out.println(sv2);
    }

    //co che tham chieu
    public static void changeName1(Student a){
        a.fullName="Ten moi";
    }

    // co che tham tri
    public static void changeName2(String oldName){
        oldName="Ten moi";
    }
}

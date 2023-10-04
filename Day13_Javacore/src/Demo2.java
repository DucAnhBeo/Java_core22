import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Demo2 {

    public static void main(String[] args) {

        try {
            Object abc;
            ObjectInputStream objectInputStream = new ObjectInputStream(FileInputStream(abc.txt));
        }catch (IIOException e){
            e.printStackTrace();
        }
    }
}

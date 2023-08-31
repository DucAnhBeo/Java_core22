import java.util.Scanner;
public class DemoSwitch {
    public static void main(String[] args) {
        String DoW =new Scanner (System.in).nextLine();

        switch (DoW) {
            case "M":
                System.out.println("Monday");
                break;
            case "Tu":
                System.out.println("Tuesday");
                break;
            case "W":
                System.out.println("Wednesday");
                break;
            case "Th":
                System.out.println("Thursday");
                break;
            case "F":
                System.out.println("Friday");
                break;
            case "Sa":
                System.out.println("Saturday");
                break;
            case "Su":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Haha");
        }

        switch (DoW) {
            case "M" -> System.out.println("Monday");
            case "Tu" -> System.out.println("Tuesday");
            case "W" -> System.out.println("Wednesday");
            case "Th" -> System.out.println("Thursday");
            case "F" -> System.out.println("Friday");
            case "Sa" -> System.out.println("Saturday");
            case "Su" -> System.out.println("Sunday");
        }

    }

}

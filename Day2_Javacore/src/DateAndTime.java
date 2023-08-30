import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateAndTime {
    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2012 ,12 ,22));

        LocalDate now=LocalDate.now();
        System.out.println(now);

        LocalDateTime now1= LocalDateTime.now();
        System.out.println(now1);




        String date1 = "20-07-2023";
        String date2 = "27-08-2023";

        LocalDate date1Object = LocalDate.parse(date1);
        LocalDate date2Object = LocalDate.parse(date2);

        long numberOfDaysDiff = date2Object.getDayOfYear() - date1Object.getDayOfYear();

        System.out.println("Số ngày cách biệt giữa 2 ngày là: " + numberOfDaysDiff);

    }
}

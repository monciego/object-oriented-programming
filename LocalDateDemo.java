import java.time.*;
public class LocalDateDemo
{
    public static void main (String []args)
    {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);
        LocalDate tomorrow = yesterday.plusDays(2);
        System.out.println("Today is " + today);
        System.out.println("Yesterday date is " + yesterday);
        System.out.println("Tomorrow date is " + tomorrow);
    }
}
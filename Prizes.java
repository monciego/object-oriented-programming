import java.util.Scanner;
public class Prizes
{
    public static void main (String []args)
    {
        double r, tp, tax;
      
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter Prize: ");
        r = input.nextDouble();
        
        if (r <= 14999.99)
        {
           System.out.println("Tax is P 0.00");
           System.out.println("Prize is: P" +r);
        }
        else if (r <= 29999.99) 
        {
            tp = r - 2250.00;
          System.out.println("Tax is P 2250.00");
          System.out.println("Prize is: P" +r);
        }
        else if (r <= 49999.99)
        {
            tp = r - 5400.00;
           System.out.println("Tax is P 5400.00");
           System.out.println("Prize is: P" +r);
        }
        else if (r <= 79999.99)
        {
            tp = r - 11000.00;
           System.out.println("Tax is P 11000.00");
           System.out.println("Prize is: P" +r);
        }
        else
        {
            tp = r - 21600.00;
           System.out.println("Tax is P 21600.0");
           System.out.println("Prize is: P" +r);
        
        }
    }
}
        
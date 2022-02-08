import java.util.Scanner;
public class smallest
{
    public static void main (String []args)
    {
       int a, b, smallNumber;
       Scanner input = new Scanner (System.in);
       System.out.println("ENTER TWO NUMBERS: ");
       a = input.nextInt();
       b = input.nextInt();
       
       smallNumber = (a < b) ? a : b;
       
       System.out.println("The Smallest Number is: " +smallNumber);
    }
}
       
       
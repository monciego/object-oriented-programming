import java.util.Scanner;
public class PositiveNegative
{
    public static void main (String []args)
    {
        int num;
        Scanner input = new Scanner (System.in);
        
        System.out.print
        ("Enter a number: ");
        num = input.nextInt();
        
        if (num > 0)
            System.out.println("Positive");
        else 
            System.out.println("Negative");
    }
}
        
import java.util.Scanner;
public class PassedConFailed
{
    public static void main (String []args)
    {
        float num;
        Scanner input = new Scanner (System.in);
        
        System.out.print
        ("Enter Grade: ");
        num = input.nextFloat();
        
        if (num <= 3)
            System.out.println("Passed");
        else if (num == 4) 
             System.out.println("Conditional");
        else 
            System.out.println("Failed");
    }
}
        
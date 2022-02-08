import java.util.Scanner;
public class SKVoterValidation
{
    public static void main (String []args)
    {
       int num;
       Scanner input = new Scanner (System.in);
        
        System.out.print("Enter Age: ");
        num = input.nextInt();
        
        if (num >=16 && num<=18)
            System.out.println("Valid to Vote");
        else 
            System.out.println("Invalid to Vote");
    }
}
        
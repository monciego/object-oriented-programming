import java.util.Scanner;
public class TotalPrizes
{
    public static void main (String []args)
    {
        float prize, tax, tp;
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter Prize: ");
        prize = input.nextFloat();
        System.out.print("Enter Tax: ");
        tax = input.nextFloat();
        
        tp = prize - tax;
        
        System.out.println("=====================================");
        System.out.println("Welcome to PCS Prize Calculator");
        System.out.println("=====================================");
        System.out.println("\nPrize: " + prize +
                "\nTax: " + tax + "\nTotal Prize: " + tp);
        
    }
}
        
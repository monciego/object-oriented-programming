import java.util.Scanner;
public class Calculate
{
    public static void main (String [] args)
    {
        int num1, num2;
        Scanner inputKo = new Scanner (System.in);
        
        System.out.print("Enter number 1: ");
        num1 = inputKo.nextInt ();
        
        System.out.print("Enter number 2: ");
        num2 = inputKo.nextInt ();
        
        Addition(num1, num2);
        System.out.println("Difference is " +Subtraction(num1, num2));
    }
    
    public static void Addition (int i, int j)
    {
        int ans;
        ans = i + j;
        System.out.println("Sum is " + ans);
    }
    public static int Subtraction (int i, int j)
    {
        int ans;
        ans = i - j;
        return ans;
    }
}


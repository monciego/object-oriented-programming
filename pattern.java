import java.util.Scanner;
public class pattern
{
    public static void main(String[] args)
    {
        int rows;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        rows = input.nextInt();
        
        for(int i = 0; i<=rows; i++)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
        for(int i = rows; i>=0; i--)
        {
            for(int j = 0; j<i; j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
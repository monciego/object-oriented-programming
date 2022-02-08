import java.util.Scanner;
public class OneHundredPoints
{
   public static void main (String[]args)
    {
       String firstword;
       String secondword;
       Scanner input = new Scanner(System.in);
            System.out.print("First Word: ");
       firstword = input.nextLine();
            System.out.print("Second Word: ");
       secondword = input.nextLine();
       firstword = firstword.toUpperCase();
            System.out.println("First Word Uppercase: " +firstword);
       secondword = secondword.toUpperCase();
            System.out.println("Second Word Uppercase: " +secondword);
       firstword = firstword.toLowerCase();
            System.out.println("First Word Lowercase: " +firstword);
       secondword = secondword.toLowerCase();
            System.out.println("Second Word Lowercase: " +secondword);
       
       if(firstword.equals(secondword))
       System.out.println(firstword + " is equal to " + secondword);
       else
       System.out.println(firstword + " is not equal to " + secondword);
       
    }
}

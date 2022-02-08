import java.util.Scanner;
public class Switch
{
    public static void main (String []args)
    {
       String year;
       char y;
       Scanner input = new Scanner (System.in);
        
        System.out.print("Enter Letter: ");
        year = input.nextLine();
        y = year.charAt(0);
  
        switch (y)
        {
            case 'F':
            case 'f':System.out.println("Freshman");
            break;
            case 'P':
            case 'p':System.out.println("Sophomore");
            break;
            case 'J':
            case 'j':System.out.println("Junior");
            break;
            case 'S':
            case 's':System.out.println("Senior");
            break;
            default: System.out.println("Invalid Year");
        }
    }
}
        
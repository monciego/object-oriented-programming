import java.util.Scanner;
public class DoWhile
{
    public static void main(String [] args)
    {
        int a, b, c;
        Scanner x = new Scanner(System.in);
        
        System.out.println("Starting Value: ");
        a = x.nextInt ();
        System.out.println("Ending Value: ");
        b = x.nextInt ();
        System.out.println("Interval: ");
        c = x.nextInt ();
        System.out.print("Sequence Value: ");
        a = a;
        if(a < b)
        do
        {
           System.out.println(" " + a);
           a+=c;
        }
        while(a<= b);
        else
        do
        {
            System.out.print(" " + a);
            a = a - c;
        }
        while (a>=b);
    }
}
            


        
            
            
        
        
       
 
    
    
    
    
    
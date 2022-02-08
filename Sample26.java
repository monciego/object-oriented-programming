import javax.swing.*;
public class Sample26
{
    public static void main (String [] args )
    {
        String thirdString = "123 Maple Drive";
        String fourthString = "a Maple tree";
        System.out.println(                
            thirdString.regionMatches(          
                false, 4, fourthString, 2, 5));
    }
}

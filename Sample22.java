import java.util.Scanner;
public class Sample22
{
    public static void main (String [] args)
    {
        String aName = "Curlo Valdez";
        int len, pos;
        char loc;
        len = aName.length();
        pos = aName.indexOf('i');
        loc = aName.charAt(5);
        System.out.println(len+" " +pos+
                            " " + loc);
    }
}

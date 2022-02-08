import java.util.Scanner;
public class Sample20
{
    public static void main (String [] args)
    {
        String aName = "Carmen";
        boolean eQual;
        eQual = aName.equals("caRMen");
        System.out.println(eQual);
        eQual = aName.equalsIgnoreCase("caRMen");
        System.out.println(eQual);
    }
    

}

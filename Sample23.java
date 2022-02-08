import java.util.Scanner;
public class Sample23
{
    public static void main (String [] args)
    {
        String aName = " Carlo Camposagrado Valedez ";
        int countOfSpace = 0, x;
        for (x = 0; x<aName.length(); ++x)
        {
            if(aName.charAt(x) == ' ')
            ++countOfSpace;
        }
        System.out.println("Number of Space: " + countOfSpace);
    }
}


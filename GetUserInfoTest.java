import java.util.Scanner;
public class GetUserInfoTest
{
    public static void main (String[] args)
    {
        String name;
        String course;
        int numberofunits;
        float rate;
        int misc;
        float tuition;
        float amount;
        
        Scanner inputDevice = new Scanner (System.in);
        
        System.out.print("Name: ");
        name = inputDevice.nextLine();
        System.out.print("Course: ");
        course = inputDevice.nextLine();
        System.out.print("Number of Units: ");
        numberofunits = inputDevice.nextInt();
        System.out.print("Rate: ");
        rate = inputDevice.nextFloat ();
        System.out.print ("Misc: ");
        misc = inputDevice.nextInt();
        tuition = numberofunits * rate;
        amount = tuition + misc;
        
        System.out.println("=======================================");
        System.out.println("Name: " + name + " \tCourse:" + course);
        System.out.println("Tuition Fee: " +tuition);
        System.out.println("Total Amount: " +amount);
        System.out.println("======================================");
        
        
    }
}
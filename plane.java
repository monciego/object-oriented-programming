import java.util.Scanner;
public class plane
{
     public static void main(String[] args)
       {
         int speed,meter;
         Scanner bilis = new Scanner(System.in);
          System.out.println("Enter a speed: "); 
speed = bilis.nextInt();
System.out.println("Enter a meter: "); 
meter = bilis.nextInt();

if ( speed >= 1100)

if ( meter >= 52)
{
   System.out.println(" Your Plane is Civilian");
}
else
{
   System.out.println("Your Plane is Military");
}
else

     System.out.println("Your Plane is Unknown");

}
}
import java.util.Scanner;
public class WhatYearYouAre
{
    public static void main (String []args)
    {
       String year;
       Scanner input = new Scanner (System.in);
        
        System.out.print("Enter Letter: ");
        year = input.nextLine();
        char y = year.charAt(0);
  
        
        if (y == 'F' || y == 'f')  
        
       
            System.out.println("Freshman");
        
        else if (y == 'P' || y == 'p')
            
             System.out.println("Sophomore");
            
        else if (y == 'J' || y == 'j')
        
            System.out.println("Junior");
        
        else if (y == 'S' || y == 's')
        
            System.out.println("Senior");
        
        else
        
            System.out.println("Invalid Year");
        

    }
}

        
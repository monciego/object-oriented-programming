import java.util.Scanner;
public class TestInvoice
{
    public static void main (String [] args)
    {
        Invoice myInvoice;
        myInvoice = getInvoiceData();
        displayInvoice(myInvoice);
    }
    public static Invoice getInvoiceData()
    {
        Invoice tempIn = new Invoice();
        
        String iName;
        int id;
        int Qt;
        int Pr;
        double TC;
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter Item Name >> " );
        iName = input.nextLine();
        tempIn.setiName(iName);
        
        System.out.print("Enter Item # >> ");
        id = input.nextInt(); 
        tempIn.setiNumber(id);
        
        System.out.print("Enter Item Quantity >> " );
        Qt = input.nextInt();
        tempIn.setQuantity(Qt);
        
        System.out.print("Enter Item Price >> " );
        Pr = input.nextInt();
        tempIn.setPrice(Pr);
        return tempIn;
        
    }
    public static void displayInvoice(Invoice anEmp)
    {
        System.out.println("\nItem Name is: "+anEmp.getiName()+ "\nItem # is: " +anEmp.getiNumber()+"\nQuantity Name is: " +anEmp.getQuantity()+ 
               "\nItem Price is: "+anEmp.getPrice()+ "\nThe Total Cost is: " +anEmp.gettCost());
    }
}
import javax.swing.JOptionPane;
public class PriceDiscount
{
    public static void main(String[] args)
    {
        String sPrice, sDiscount;
        double price;
        int discount;
        
        sPrice = JOptionPane.showInputDialog(null, "Regular Price: ");
        price = Double.parseDouble(sPrice);
        sDiscount = JOptionPane.showInputDialog(null, "Discount %: ");
        discount = Integer.parseInt(sDiscount);
        
        compute(price,discount);
    }
    
    public static void compute(double price, int discount)
    {
        double total, ded;
        ded = price * ((double)discount/100);
            total = price - ded;
            JOptionPane.showMessageDialog(null, "Discounted Price: "+ total);
        }
    }
    


        
        
        
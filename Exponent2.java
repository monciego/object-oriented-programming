import javax.swing.JOptionPane;
public class Exponent2
{
    public static void main (String [] args)
    {
        int num1;
        int num2;      
        String result;
        
        
        result = JOptionPane.showInputDialog(null, "Enter a number");
        num1 = Integer.parseInt (result);
        num2= Integer.parseInt (result);
        
        Squared(num1, num2);
        JOptionPane.showMessageDialog (null, "Cube is " + Cube (num1, num2));
    }
    
   public static void Squared (int i, int j)
   {
       int ans;
       ans = (i * j);
       JOptionPane.showMessageDialog(null, "Squared is " + ans);
    }
   public static int Cube (int i, int j)
   {
       int ans;
       ans = i * i * j;
       return ans;
    }
    public static int
}
       
    
       
        
    
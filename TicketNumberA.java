import javax.swing.JOptionPane;
 public class TicketNumberA
{ 
     public static void main(String[] args) {
         int a;
         int b;
         int c;
         int d;
         String x ;
         boolean isYes; 
         x = JOptionPane.showInputDialog(null, "Enter Your Ticket Number: ");
         a = Integer.parseInt(x);
         b = a/10;
         c=b%7;
         d=a %10;
         JOptionPane.showMessageDialog(null, "Your Ticket Number is " + x);
         isYes = (d == c);
         
         JOptionPane.showMessageDialog(null, "Your ticket is " + isYes, "Output", JOptionPane.INFORMATION_MESSAGE); 
        } 
    }

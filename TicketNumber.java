import javax.swing.JOptionPane;
 public class TicketNumber
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
         b=a/10;
         c=2%7;
         d=a%10;
         isYes = (d == c);
         
         JOptionPane.showMessageDialog(null, "You responded " + isYes, "Message", JOptionPane.INFORMATION_MESSAGE); 
        } 
    }

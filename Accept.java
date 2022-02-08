    import javax.swing.JOptionPane;
    
    public class Accept
    {
    
        public static void main (String[] args)
    {
        String input;
        int hours;
        int mins;
        int minutes;
        
        input = JOptionPane.showInputDialog("Enter How Many Minutes: ");
        minutes = Integer.parseInt(input);
        hours = minutes / 60;
        mins = minutes % 60;
        
        
        JOptionPane.showMessageDialog(null," The Total Time You Worked:  " + hours +" hours and " + mins + " minutes","Output",JOptionPane.WARNING_MESSAGE);
    }
    }
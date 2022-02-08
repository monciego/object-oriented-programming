import javax.swing.JOptionPane;
public class Sample25
{
    public static void main (String [] args)
    {
        String name, starts, ends, nameU, nameL;
        int len, num;
        boolean guess1, guess2; 
        name = JOptionPane.showInputDialog(null, "Enter Complete Name");
        starts = JOptionPane.showInputDialog(null, "Starts With");
        ends = JOptionPane.showInputDialog(null, "Ends With");
        len = name.length();
        nameU = name.toUpperCase();
        nameL = name.toLowerCase();
        guess1 = name.startsWith("car");
        guess2 = name.endsWith("ado");
        num = name.indexOf('a');
      
        JOptionPane.showMessageDialog(null, "Complete Name: " + name + "\nLength: " + len + 
                                           "\nIn All Upper Case: " + nameU + "\nIn All Lower Case: " + nameL +
                                           "\nStarts With car: " + guess1 + "\nEnds With ado: " + guess2 + "\n# of a: " + num );
     
        
    }
}
import javax.swing.JOptionPane;
public class GUIAssignment
{
    public static void main (String[] args)
    {
        String name;
        String course;
        String space;
        String units;
        String rate;
        String misc;
        double amount;
        double total;
        
        name = JOptionPane.showInputDialog(null, "Name: ");
        course = JOptionPane.showInputDialog(null, "Course: ");
        units = JOptionPane.showInputDialog(null, "Units: ");
        rate = JOptionPane.showInputDialog(null, "Rate: ");
        misc = JOptionPane.showInputDialog(null, "Misc: ");
        amount = Double.parseDouble(units) * Double.parseDouble(rate);
        total = amount + Double.parseDouble(misc);
        JOptionPane.showMessageDialog (null, "Name:" + name + "\nCourse" +course + 
        "\nNumber of Units: " + units + "\nRate: " + rate + "\nMisc: " + misc);
        space = JOptionPane.showInputDialog (" ");
        JOptionPane.showMessageDialog (null, "\n\n" + space + "\nName: " + name +
        "         " + "Course: " + course + "\nTuition Fee:" + amount + "\nTotal Amount:" + total + "\n" + space);
    }
        
        
        
    
}
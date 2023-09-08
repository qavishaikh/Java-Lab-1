import javax.swing.JOptionPane;
public class Task12 {
    //Convert CFoot to Yard
    public static void main(String [] args) {
        String day = JOptionPane.showInputDialog("Enter Week");
        int fot = Integer.parseInt(day);
        double foot = fot/3;
        String name = "Muhammad Qavi";
        JOptionPane.showMessageDialog(null,foot + "\n" + name);
        
    }
}

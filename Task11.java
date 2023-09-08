import javax.swing.JOptionPane;
public class Task11 {
    //Convert Centimeter to Foot
    public static void main(String [] args) {
        String day = JOptionPane.showInputDialog("Enter Cenrimeter");
        int cen = Integer.parseInt(day);
        double centi = cen/30.48;
        String name = "Muhammad Qavi";
        JOptionPane.showMessageDialog(null,centi + "\n" + name);
        
    }
}

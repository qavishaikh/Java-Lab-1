import javax.swing.JOptionPane;
public class Task9 {
    //Convert Kilo into Grams
    public static void main(String [] args) {
        String day = JOptionPane.showInputDialog("Enter Kilo ");
        int kilo = Integer.parseInt(day);
        double kilos = kilo*1000;
        String name = "Muhammad Qavi";
        JOptionPane.showMessageDialog(null,kilos + "\n" + name);
        
    }
}

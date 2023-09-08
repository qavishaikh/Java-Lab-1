import javax.swing.JOptionPane;
public class Task7 {
    //Convert Week into Minutes
    public static void main(String [] args) {
        String day = JOptionPane.showInputDialog("Enter Week");
        int min = Integer.parseInt(day);
        double mins = min*7*60;
        String name = "Muhammad Qavi";
        JOptionPane.showMessageDialog(null,mins + "\n" + name);
        
    }
}

import javax.swing.JOptionPane;
public class Task4 {
     //Convert Month into Minutes
     public static void main(String [] args) {
        String day = JOptionPane.showInputDialog("Enter Month");
        int month = Integer.parseInt(day);
        int months = month*43800;
        String name = "Muhammad Qavi";
        JOptionPane.showMessageDialog(null,months + "\n" + name);
        
    }
}

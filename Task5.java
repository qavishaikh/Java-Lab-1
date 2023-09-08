import javax.swing.JOptionPane;
public class Task5 {
    //Convert Month into Second
    public static void main(String [] args) {
        String day = JOptionPane.showInputDialog("Enter Month");
        int month = Integer.parseInt(day);
        double months = month*2.628000000;
        String name = "Muhammad Qavi";
        JOptionPane.showMessageDialog(null,months + "\n" + name);
        
    }
}

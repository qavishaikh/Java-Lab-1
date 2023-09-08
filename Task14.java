import javax.swing.JOptionPane;
public class Task14 {
     //Convert Second to Minutes
     public static void main(String [] args) {
        String day = JOptionPane.showInputDialog("Enter Second");
        int sec = Integer.parseInt(day);
        double secs = sec/60;
        String name = "Muhammad Qavi";
        JOptionPane.showMessageDialog(null,secs + "\n" + name);
        
    }
}

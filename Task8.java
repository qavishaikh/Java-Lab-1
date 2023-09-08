import javax.swing.JOptionPane;
public class Task8 {
    //Convert Year into Days
    public static void main(String [] args) {
        String day = JOptionPane.showInputDialog("Enter Year");
        int year = Integer.parseInt(day);
        double years = year*365;
        String name = "Muhammad Qavi";
        JOptionPane.showMessageDialog(null,years + "\n" + name);
        
    }
}

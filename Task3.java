import javax.swing.JOptionPane;
public class Task3 {
    //Convert day to year
    public static void main(String [] args) {
        String day = JOptionPane.showInputDialog("Enter Day");
        int year = Integer.parseInt(day);
        int years = year/365;
        String name = "Muhammad Qavi";
        JOptionPane.showMessageDialog(null,years + "\n" + name);
        
    }
}

import javax.swing.JOptionPane;
public class Task6 {
    //Convert Week into Days
    public static void main(String [] args) {
        String day = JOptionPane.showInputDialog("Enter Week");
        int week = Integer.parseInt(day);
        double weeks = week*7;
        String name = "Muhammad Qavi";
        JOptionPane.showMessageDialog(null,weeks + "\n" + name);
        
    }
}
